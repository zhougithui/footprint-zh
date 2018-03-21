package com.lanmao.data.sync.server.job;

import com.lanmao.data.SpringUtils;
import com.lanmao.data.sync.client.param.DataSyncPacket;
import com.lanmao.data.sync.server.service.BatchSaveDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author hui.zhou 15:25 2018/3/9
 */
public class BatchSaveTask extends Thread {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private BlockingQueue<DataSyncPacket> blockingQueue;

    public BatchSaveTask(BlockingQueue<DataSyncPacket> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    //public static AtomicLong count = new AtomicLong();

    @Override
    public void run() {
        //logger.info("数据持久化任务开始");
        BatchSaveDataService batchSaveDataService = SpringUtils.getBean(BatchSaveDataService.class);
        int packetSize = 0;
        List<DataSyncPacket> packetList = new ArrayList<>();
        try {
            while(BatchSaveDataJobLauncher.RUNNING.get()) {
                DataSyncPacket dataSyncPacket = blockingQueue.poll(3, TimeUnit.SECONDS);
                if (dataSyncPacket == null) {
                    if (packetSize > 0 || !packetList.isEmpty()) {
                        //持久化数据
                        batchSaveDataService.saveList(packetList);
                        packetSize = 0;
                        packetList.clear();
                    }
                } else {
                    if (packetSize == 10) {
                        //持久化数据
                        batchSaveDataService.saveList(packetList);
                        packetSize = 0;
                        packetList.clear();
                    } else {
                        packetSize++;
                    }
                    packetList.add(dataSyncPacket);
                }

            }
        } catch (InterruptedException e) {
            logger.error("线程中断异常");
            Thread.currentThread().interrupt();
        }

        logger.info("消费线程任务关闭");
    }
}
