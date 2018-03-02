package com.footprint.mybatis.generator.test.parameters;

import com.footprint.mybatis.generator.parameters.ArrayBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 可变参数警告
 */
public class ArrayBuilderTest {

  public static void main(String[] args) {

    List<String> stringListA = new ArrayList<String>();
    List<String> stringListB = new ArrayList<String>();

    ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
    ArrayBuilder.addToList(stringListA, "Ten", "Eleven", "Twelve");
    List<List<String>> listOfStringLists = new ArrayList<List<String>>();
    ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);

    ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));


    ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);
    ArrayBuilder.addToList2(listOfStringLists, stringListA, stringListB);
    ArrayBuilder.addToList3(listOfStringLists, stringListA, stringListB);
  }

}