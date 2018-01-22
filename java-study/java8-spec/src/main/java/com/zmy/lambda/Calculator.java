package com.zmy.lambda;

/**
 * lambda表达式example
 * @author hui.zhou 15:13 2018/1/22
 */
@FunctionalInterface
public interface Calculator {
    /**
     * a和b做运算，得到结果
     * @param a
     * @param b
     * @return
     */
    public int compulate(int a, int b);
}
