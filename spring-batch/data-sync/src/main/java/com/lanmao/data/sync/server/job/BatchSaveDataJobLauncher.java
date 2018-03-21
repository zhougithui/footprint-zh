package com.lanmao.data.sync.server.job;

import com.lanmao.data.sync.client.DefaultThreadFactory;
import com.lanmao.data.sync.client.param.DataSyncPacket;
import com.lanmao.data.sync.thread.DataSyncBlockQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 批量保存同步数据
 * @author hui.zhou 15:16 2018/3/9
 */
@Service
public class BatchSaveDataJobLauncher implements DisposableBean {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /*线程池状态*/
    public static AtomicBoolean RUNNING = new AtomicBoolean(false);
    public static DataSyncBlockQueue<DataSyncPacket> queue = new DataSyncBlockQueue<>();
    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(20, 20, 0, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(),new DefaultThreadFactory("data-sync-consumer"), new BatchSaveRejectedExecutionHandler());

    /**
     * 初始化任务
     */
    private synchronized void init() {
        logger.info("消费线程池初始化-START");
        //开启任务
        int size = poolExecutor.getCorePoolSize();

        for(int i=0; i<size; i++){
            Thread task = new BatchSaveTask(queue);
            task.setUncaughtExceptionHandler(new ExceptionLogger());
            poolExecutor.execute(task);
        }
        logger.info("消费线程池初始化-END");
    }

    /**
     * 增加线程数
     * @param size
     */
    public void incrementPoolSize(int size) {
        logger.info("调整消费线程数，增加{}", size);
        for(int i=0; i<size; i++){
            Thread task = new BatchSaveTask(queue);
            task.setUncaughtExceptionHandler(new ExceptionLogger());
            poolExecutor.execute(task);
        }
        logger.info("调整消费线程数完毕");
    }

    /**
     * 批量保存同步数据
     * @param packet
     */
    public void saveData(DataSyncPacket packet){
        if(RUNNING.compareAndSet(false, true)){
            init();
        }

        try {
            queue.put(packet);
            //logger.info("接收数据，{}", counter.getAndIncrement());
        } catch (InterruptedException e) {
            logger.error("数据包放入持久化队列失败", e);
        }
    }
    //public static AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void destroy() throws Exception {
        if(RUNNING.compareAndSet(true, false)){
            try {
                logger.info("关闭数据同步消费端线程池");
                TimeUnit.SECONDS.sleep(3);
                poolExecutor.shutdown();
            } catch (Exception e) {
                logger.warn("数据同步消费线程池释放资源失败");
            }
        }
    }
}
