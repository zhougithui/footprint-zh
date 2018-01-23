package com.zmy.test.utils;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 数组并行处理
 */
public class ArraysTest {
    public static void main( String[] args ) {
        long[] arrayOfLong = new long [ 20000 ];        
         
        Arrays.parallelSetAll( arrayOfLong, 
            index -> ThreadLocalRandom.current().nextInt( 1000000 ) );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach( 
            i -> System.out.print( i + " " ) );

        System.out.println("---------------分割线-----------------");
         
        Arrays.parallelSort( arrayOfLong );     
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach( 
            i -> System.out.print( i + " " ) );
    }
}