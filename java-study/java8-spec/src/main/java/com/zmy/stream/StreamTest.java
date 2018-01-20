package com.zmy.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author hui.zhou 8:55 2018/1/4
 */
public class StreamTest {
    public static void main(String[] args){
        // 将Stream转换成List或Set
        Stream<String> stream = Arrays.asList("I", "love", "you", "too").stream();
        List<String> list = stream.collect(Collectors.toList()); // (1)
        Set<String> set = stream.collect(Collectors.toSet()); // (2)
        // 使用toCollection()指定规约容器的类型
        List<String> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));// (3)
        HashSet<String> hashSet = stream.collect(Collectors.toCollection(HashSet::new));// (4)

        List<Integer> integerList = stream.map(val -> val.hashCode()).collect(Collectors.toCollection(ArrayList::new));

    }

}
