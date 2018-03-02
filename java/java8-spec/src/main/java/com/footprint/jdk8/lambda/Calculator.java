package com.footprint.jdk8.lambda;

/**
 * 函数式接口示例
 *
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
    int compulate(int a, int b);

    /**
     * 接口默认方法，不会破坏函数式接口
     * @param a
     * @param b
     * @return
     */
    default double compulateDefault(double a, double b){
        return a/b;
    }

    /**
     * 静态方法也不会破坏函数式接口完整性
     * @param a
     * @param b
     * @return
     */
    static double compulateStatic(int a, int b){
        return Math.pow(a, b);
    }
}
