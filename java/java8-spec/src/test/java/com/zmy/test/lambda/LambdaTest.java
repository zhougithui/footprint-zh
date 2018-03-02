package com.zmy.test.lambda;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args){
        //最简单的lambda表达式
        //参数 -> （分隔符） 语句
        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );
        //复杂点的可以有语句块
        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );

        //Lambda表达式可以引用类成员和局部变量（会将这些变量隐式得转换成final的）
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
        //等价于下面final修饰
        /*final String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );*/

        //Lambda表达式有返回值，返回值的类型也由编译器推理得出。
        //如果Lambda表达式中的语句块只有一行，则可以不用使用return语句
        /**
         * 一下三种方式都是一样的效果
         */
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
        Arrays.asList( "a", "b", "d" ).sort(String::compareTo);
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );
    }
}
