package com.footprint.jdk8.test.concurency.string;

import com.footprint.jdk8.concurency.WaitingFuturesRunner;
import com.footprint.jdk8.concurency.result.StringResults;
import com.footprint.jdk8.concurency.task.StringInputTask;
import com.footprint.jdk8.concurency.task.Task;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Test
 */
public class CompletableFuturesRunnerTest {

    /**
     *  5 tasks at 3000ms concurrently should not be more than 3100
     * @throws Exception error
     */
    @org.junit.Test//(timeout = 3100)
    public void testGo() throws Exception {
        final List<Task<String, String>> taskList = setupTasks();

        final WaitingFuturesRunner<String, String> completableFuturesRunner = new WaitingFuturesRunner<>(taskList, 4, TimeUnit.SECONDS);
        final StringResults consolidatedResults = new StringResults();

        completableFuturesRunner.go("Something To Process", consolidatedResults);

        Assert.assertEquals(5, consolidatedResults.getResults().size());
        for (final String s : consolidatedResults.getResults()) {
            Assert.assertTrue(s.contains("complete"));
            Assert.assertTrue(s.contains("Something To Process"));
        }


    }

    private List<Task<String, String>> setupTasks() {
        final List<Task<String, String>> taskList = new ArrayList<>();
        final StringInputTask stringInputTask = new StringTask("Task 1");
        final StringInputTask stringInputTask2 = new StringTask("Task 2");
        final StringInputTask stringInputTask3 = new StringTask("Task 3");
        final StringInputTask stringInputTask4 = new StringTask("Task 4");
        final StringInputTask stringInputTask5 = new StringTask("Task 5");
        taskList.add(stringInputTask);
        taskList.add(stringInputTask2);
        taskList.add(stringInputTask3);
        taskList.add(stringInputTask4);
        taskList.add(stringInputTask5);
        return taskList;
    }
}