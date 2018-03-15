package com.lanmao.data.sync.param;

public class QueryPool{
    private String name;//线程名称
    private long taskCount;//线程池需要执行的任务数量。
    private long completedTaskCount;//线程池在运行过程中已完成的任务数量。小于或等于taskCount。
    private long largestPoolSize;//线程池曾经创建过的最大线程数量。通过这个数据可以知道线程池是否满过。如等于线程池的最大大小，则表示线程池曾经满了。
    private long poolSize;//线程池的线程数量。如果线程池不销毁的话，池里的线程不会自动销毁，所以这个大小只增不+
    private long activeCount;//获取活动的线程数。

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(long taskCount) {
        this.taskCount = taskCount;
    }

    public long getCompletedTaskCount() {
        return completedTaskCount;
    }

    public void setCompletedTaskCount(long completedTaskCount) {
        this.completedTaskCount = completedTaskCount;
    }

    public long getLargestPoolSize() {
        return largestPoolSize;
    }

    public void setLargestPoolSize(long largestPoolSize) {
        this.largestPoolSize = largestPoolSize;
    }

    public long getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(long poolSize) {
        this.poolSize = poolSize;
    }

    public long getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(long activeCount) {
        this.activeCount = activeCount;
    }
}