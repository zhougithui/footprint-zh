package com.zmy.test.io;

import com.zmy.constants.ClassPathConstants;
import com.zmy.utils.FpStringBuilder;
import com.zmy.utils.ProjectPathUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author hui.zhou 8:52 2018/1/25
 */
public class IoStreamTest {

    @Test
    public void testIo() throws IOException {
        //遍历文件夹
        Files.list(new File(ProjectPathUtils.pathOfClass(IoStreamTest.class)).toPath()).forEach(System.out::println);

        System.out.println("---------------分割线-----------------");

        try( BufferedReader reader = new BufferedReader(new FileReader(
                new File(FpStringBuilder.buildDefault()
                        .append(ProjectPathUtils.projectPath())
                        .append(File.separator)
                        .append(ClassPathConstants.TEST_SRC_PATH)
                        .append(File.separator)
                        .append(ProjectPathUtils.packageToPath(IoStreamTest.class))
                        .append(ClassPathConstants.JAVA_SUFFIX).toString())))){
            reader.lines().forEach(System.out::println);
        }

/*
        BufferedReader.line() --> 返回文本行的流 Stream
        File.lines(Path, Charset) -->返回文本行的流 Stream
        File.list(Path) -->遍历当前目录下的文件和目录
        File.walk(Path, int,FileVisitOption)--> 遍历某一个目录下的所有文件和指定深度的子目录
        File.find(Path, int, BiPredicate, FileVisitOption... ) -->查找相应的文件*/
    }
}
