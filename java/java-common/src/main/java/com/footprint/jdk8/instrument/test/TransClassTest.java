package com.footprint.jdk8.instrument.test;

import com.footprint.jdk8.instrument.TransClass;

/**
 * 运行参数增加javaagent，用maven打包的jar文件
 * -javaagent:F:/worksoftware/eclipsejee-neon/workspace/java/instrument/target/instrument-0.0.1-SNAPSHOT.jar
 * @author q
 *
 */
public class TransClassTest {
	public static void main(String[] args) {
		System.out.println(new TransClass().getNumber("zh"));
	}
}