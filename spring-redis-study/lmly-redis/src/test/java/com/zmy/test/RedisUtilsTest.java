package com.zmy.test;

import com.zmy.RedisUtils;
import com.zmy.utils.GsonUtils;
import com.zmy.vo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author hui.zhou 14:26 2018/1/3
 */
public class RedisUtilsTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-redis.xml", RedisUtilsTest.class);
        ac.registerShutdownHook();

        Student zmy = new Student();
        zmy.setAge(20);
        zmy.setBirthday(new Date());
        zmy.setName("zmy");
        zmy.setScore(BigDecimal.valueOf(59.5));

        //-------------------------------------
        //---------------分割线-----------------
        //-------------------------------------
        RedisUtils.set("age", 50);
        System.out.println(RedisUtils.get("age", int.class));
        RedisUtils.set("name", "zmy");
        System.out.println(RedisUtils.get("name", String.class));

        //-------------------------------------
        //---------------分割线-----------------
        //-------------------------------------
        RedisUtils.lputAll("lstus", Arrays.asList(zmy));
        List<Student> infoList = RedisUtils.lgetAll("lstus", Student.class);
        infoList.forEach(stu -> System.out.println(GsonUtils.buildGson().toJson(stu)));

        //-------------------------------------
        //---------------分割线-----------------
        //-------------------------------------
        Map<String, Student> map = new HashMap<>();
        map.put(zmy.getName(), zmy);
        RedisUtils.hmset("maps", map);

        Map<String, Student> result = RedisUtils.hgetAll("maps", Map.class);
        System.out.println(result.get(zmy.getName()).getBirthday());

        //-------------------------------------
        //---------------分割线-----------------
        //-------------------------------------
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(zmy);
        RedisUtils.saddAll(zmy.getName(), studentSet);
        RedisUtils.smenbers(zmy.getName(), Student.class).forEach(val -> System.out.println(zmy.getScore()));


        //-------------------------------------
        //---------------分割线-----------------
        //-------------------------------------
        RedisUtils.set("expire", "fdsa");
        int seconds = 0;
        while (seconds <= 10){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println(RedisUtils.exists("expire"));
            seconds++;
        }
        ac.close();
    }
}
