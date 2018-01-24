package com.zmy.test.stream;

import com.zmy.test.common.Person;
import com.zmy.utils.GsonUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 新Stream接口
 * @author hui.zhou 8:55 2018/1/4
 */
public class StreamTest {

    List<Person> perList = new ArrayList<>();
    @Before
    public void init(){
        for(int x=10; x>0; x--){
            Person p1 = new Person();
            p1.setBirthday(LocalDate.now());
            Predicate<Integer> predicate = i -> i % 2 == 0;
            p1.setFemale(predicate.test(x));
            p1.setName(predicate.test(x) ? ("zmy" + x) : ("zh" + x));
            p1.setAge(ThreadLocalRandom.current().nextInt(100));

            perList.add(p1);
            if(predicate.test(x)){
                perList.add(p1);
            }
        }

    }

    /**
     * 获取流
     */
    @Test
    public void testObtain(){
        /**
         * 集合
         */
        List<Person> list = new ArrayList<>();
        Stream<Person> stream = list.stream();

        /**
         * 数组
         */
        String[] names = {"chaimm","peter","john"};
        Stream<String> arrStream = Arrays.stream(names);

        /**
         * 可变参数
         */
        Stream<String> argsStream = Stream.of("chaimm","peter","john");

        /**
         * 文件
         */
        try(Stream<String> lines = Files.lines(Paths.get(""), Charset.defaultCharset())){
            //可对lines做一些操作
            System.out.println(lines.count());
        }catch(IOException e){
        }
    }

    /**
     * 过滤
     */
    @Test
    public void testFilter(){
        List<Person> result = perList.stream()
                .filter(Person::isFemale)
                .collect(Collectors.toList());
        result.forEach(per -> System.out.println(GsonUtils.buildGson().toJson(per)));
    }

    /**
     * 去重
     */
    @Test
    public void testDistinck(){
        Assert.assertEquals(perList.size(), 15);
        Assert.assertEquals(perList.stream().distinct().count(), 10);
    }

    /**
     * 截取
     */
    @Test
    public void testLimit(){
        Assert.assertEquals(10, perList.stream().limit(10).collect(Collectors.toList()).size());
    }

    /**
     * 跳过
     */
    @Test
    public void testSkip(){
        Assert.assertEquals(10, perList.stream().skip(5).collect(Collectors.toList()).size());
    }

    /**
     * 映射
     * 将一个类型映射成另外一个类型输出
     */
    @Test
    public void testMap(){
        List<String> nameList = perList.stream().map(Person::getName).collect(Collectors.toList());
        nameList.forEach(System.out::println);
    }

    /**
     * 流汇聚
     */
    @Test
    public void testMerge(){
        List<String> list = new ArrayList<>();
        list.add("I am a boy");
        list.add("I love the girl");
        list.add("But the girl loves another girl");

        List<String> wordList = list.stream()
                .map(line->line.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        wordList.forEach(System.out::println);
    }

    /**
     * 匹配
     */
    @Test
    public void testMatch(){
        boolean hasFemale = perList.stream()
                .anyMatch(Person::isFemale);
        Assert.assertTrue(hasFemale);

        boolean isAllFemale = perList.stream()
                .allMatch(Person::isFemale);
        Assert.assertFalse(isAllFemale);

        boolean hasNoFemale = perList.stream()
                .noneMatch(Person::isFemale);
        Assert.assertFalse(hasNoFemale);
    }

    /**
     * 返回元素
     */
    @Test
    public void testFind(){
        Optional<Person> person = perList.stream().findAny();
        System.out.println(GsonUtils.buildGson().toJson(person));
        System.out.println(GsonUtils.buildGson().toJson(perList.stream().findFirst()));
    }

    /**
     * 归纳
     */
    @Test
    public void testReduce(){
        int age = perList.stream().mapToInt(Person::getAge).reduce(0,Integer::sum);
        //int age = perList.stream().map(person -> person.getAge()).reduce(0,Integer::sum);
        System.out.println("age sum=" + age);
        System.out.println("年级最大的：" + perList.stream().mapToInt(Person::getAge).max());
    }
}
