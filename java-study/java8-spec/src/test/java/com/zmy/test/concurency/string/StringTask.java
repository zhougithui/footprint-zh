package com.zmy.test.concurency.string;

import com.zmy.concurency.task.StringInputTask;

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
