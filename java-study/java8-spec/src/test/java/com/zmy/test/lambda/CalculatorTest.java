package com.zmy.test.lambda;

import com.zmy.lambda.Calculator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * lambda表达式
 * (params) -> expression
 * (params) -> statement
 * (params) -> { statements }
 */
public class CalculatorTest {
    public static void main(String[] args){
        //加法
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.compulate(1, 2));
        System.out.println(calculator.compulateDefault(1, 2));
        System.out.println(Calculator.compulateStatic(2,3));

        //乘法
        calculator = (a, b) -> a * b;
        System.out.println(calculator.compulate(10, 8));

        //匿名函数
        //减法
        System.out.println(calculate(10, 1, (a, b) -> a - b));
    }

    /**
     * 传递函数作为一个参数
     * @param a
     * @param b
     * @param calculator
     * @return
     */
    public static int calculate(int a, int b, Calculator calculator){
        return calculator.compulate(a, b);
    }
}
