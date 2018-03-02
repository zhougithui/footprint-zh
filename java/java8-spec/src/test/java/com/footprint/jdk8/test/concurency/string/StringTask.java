package com.footprint.jdk8.test.concurency.string;

import com.footprint.jdk8.concurency.task.StringInputTask;

/**
 * 字符串处理类
 */
public class StringTask extends StringInputTask {

    public StringTask(String taskName) {
        super(taskName);
    }

    @Override
    public String process(String input) {
        return null;
    }


}
