package com.footprint.mybatis.generator.parameters;

import java.util.Arrays;
import java.util.List;

/**
 * 可变参数警告
 */
public class ArrayBuilder {

    public static <T> void addToList(List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    @SuppressWarnings({"unchecked", "varargs"})
    public static <T> void addToList2(List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    @SafeVarargs
    public static <T> void addToList3(List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    public static void faultyMethod(List<String>... l) {
        Object[] objectArray = l;  // Valid
        objectArray[0] = Arrays.asList(new Integer(42));
        String s = l[0].get(0);    // ClassCastException thrown here
    }

}