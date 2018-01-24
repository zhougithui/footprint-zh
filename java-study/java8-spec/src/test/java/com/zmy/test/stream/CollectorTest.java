package com.zmy.test.stream;

import com.zmy.test.common.Person;
import com.zmy.utils.GsonUtils;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 收集器使用
 */
public class CollectorTest {
    List<Person> perList = new ArrayList<>();

    @Before
    public void init(){
        for(int x=10; x>0; x--){
            Person person = new Person();
            person.setBirthday(LocalDate.now());
            Predicate<Integer> predicate = i -> i % 2 == 0;
            person.setFemale(predicate.test(x));
            person.setName(predicate.test(x) ? ("zmy" + x) : ("zh" + x));
            person.setAge(ThreadLocalRandom.current().nextInt(100));

            perList.add(person);
            perList.add(person);
        }

    }

    /**
     * 计数
     */
    @Test
    public void testCount(){
        long count = perList.stream()
                .collect(Collectors.counting());
        System.out.println(count);

        //long count = list.stream().count();
    }

    /**
     * 最大最小
     */
    @Test
    public void testMaxMin(){
        Optional<Person> oldPerson = perList.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Person::getAge)));
        System.out.println(GsonUtils.buildGson().toJson(oldPerson.get()));
        System.out.println(GsonUtils.buildGson().toJson(
                perList.stream().collect(Collectors.minBy(Comparator.comparingInt(Person::getAge)))
                ));
    }

    /**
     * 求和
     */
    @Test
    public void testSum(){
        int summing = perList.stream()
                .collect(Collectors.summingInt(Person::getAge));
    }

    /**
     * 求平均值
     */
    @Test
    public void testAverage(){
        double avg = perList.stream()
                .collect(Collectors.averagingInt(Person::getAge));
    }

    /**
     * Collectors.summarizingInt函数能一次性将最值、均值、总和、元素个数全部计算出来，并存储在对象IntSummaryStatisics中
     * 可以通过该对象的getXXX()函数获取这些值。
     */
    @Test
    public void testAll(){
        IntSummaryStatistics statisics = perList.stream()
                .collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(statisics);
    }

    @Test
    public void testOther(){
        /**
         * 名字连接
         */
        String names = perList.stream().map(person -> person.getName())
                .collect(Collectors.joining());

        /*String names = perList.stream().map(person -> person.getName())
                .collect(Collectors.joining(", "));*/
    }

    /**
     * 若你需要自定义一个归约操作，那么需要使用Collectors.reducing函数，该函数接收三个参数：
         第一个参数为归约的初始值
         第二个参数为归约操作进行的字段
         第三个参数为归约操作的过程
     */
    @Test
    public void testReduce(){
        //计算所有人的年龄总和
        //第一个参数表示归约的初始值。我们需要累加，因此初始值为0
        //第二个参数表示需要进行归约操作的字段。这里我们对Person对象的age字段进行累加。
        //第三个参数表示归约的过程。这个参数接收一个Lambda表达式，而且这个Lambda表达式
        //      一定拥有两个参数，分别表示当前相邻的两个元素。由于我们需要累加，因此我们只需将相邻的两个元素加起来即可。
        Integer age = perList.stream()
                .collect(Collectors.reducing(0,Person::getAge,(i,j)->i+j));

        /*Optional<Integer> sumAge = perList.stream()
                .filter(Person::isFemale)
                .mapToInt(Person::getAge)
                .collect(Collectors.reducing((i,j)->i+j));*/
    }

    /**
     * 分组
     */
    @Test
    public void testGroup(){
        /*Map<String,List<Person>> result = perList.stream()
                .collect(Collectors.groupingBy((person)->{
                    if(person.getAge()>60)
                        return "老年人";
                    else if(person.getAge()>40)
                        return "中年人";
                    else
                        return "青年人";
                }));*/


        //二重分组
        /*Map<String,Map<String,List<Person>>> result = perList.stream()
                .collect(Collectors.groupingBy((person)->{
                            if(person.getAge()>60)
                                return "老年人";
                            else if(person.getAge()>40)
                                return "中年人";
                            else
                                return "青年人";
                        },
                        Collectors.groupingBy(Person::getName)));*/

        //分组统计
        Map<String,Long> result = perList.stream()
                .collect(Collectors.groupingBy((person)->{
                            if(person.getAge()>60)
                                return "老年人";
                            else if(person.getAge()>40)
                                return "中年人";
                            else
                                return "青年人";
                        },
                        Collectors.counting()));
    }

    @Test
    public void testConver(){
        /*Map<String,Integer> map = perList.stream()
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Person::getAge)),
                                Optional::get
                        )));*/
    }
}
