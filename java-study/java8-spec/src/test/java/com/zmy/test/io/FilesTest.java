package com.zmy.test.io;

import com.zmy.constants.CommonConstants;
import com.zmy.utils.FpStringBuilder;
import com.zmy.utils.PathUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.file.*;

/**
 * Files类测试
 * @author hui.zhou 8:52 2018/1/25
 */
public class FilesTest {
    String filePath = "";
    String testTxtPath = "";

    @Before
    public void init(){
        filePath = FpStringBuilder.buildDefault()
                .append(PathUtils.projectPath())
                .append(File.separator)
                .append(CommonConstants.TEST_SRC_PATH)
                .append(File.separator)
                .append(PathUtils.packageToPath(FilesTest.class))
                .append(CommonConstants.JAVA_SUFFIX).toString();
        testTxtPath = FpStringBuilder.buildDefault()
                .append(PathUtils.projectPath())
                .append(File.separator)
                .append(CommonConstants.TEST_SRC_PATH)
                .append(File.separator)
                .append(PathUtils.packageToPath(FilesTest.class))
                .append(".txt").toString();
    }

    /**
     * Files.list
     * @throws IOException
     */
    @Test
    public void testList() throws IOException {
        //遍历文件夹
        Files.list(new File(PathUtils.pathOfClass(FilesTest.class)).toPath()).forEach(System.out::println);
    }

    /**
     * Files.lines
     */
    @Test
    public void testLines(){
        try {
            Files.lines(Paths.get(filePath)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Files.readLines
     */
    @Test
    public void testReadLines(){
        try {
            Files.readAllLines(Paths.get(filePath)).stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Files.newBufferedReader
     */
    @Test
    public void testReaderBuffer(){
        try {
            Files.newBufferedReader(Paths.get(filePath)).lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Files.newBufferedWriter
     */
    @Test
    public void testWrite(){
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(testTxtPath), StandardOpenOption.CREATE,StandardOpenOption.WRITE);
            Files.newBufferedReader(Paths.get(filePath)).lines().forEach(line -> {
                try {
                    writer.write(line);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reader
     */
    @Test
    public void testReader(){
        File file = new File(filePath);
        try {
            try( BufferedReader reader = new BufferedReader(new FileReader(file))){
                reader.lines().forEach(System.out::println);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 遍历某一个目录下的所有文件和指定深度的子目录
     */
    @Test
    public void testWalk(){
        try {
            Files.walk(Paths.get(PathUtils.projectPath()), 8, FileVisitOption.FOLLOW_LINKS)
                .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查找相应的文件
     */
    @Test
    public void testFind(){
        try {
            Files.find(
                    Paths.get(PathUtils.projectPath()),
                    8,
                    (path, fileAttributes) -> fileAttributes.isRegularFile() && path.toString().endsWith(CommonConstants.JAVA_SUFFIX),
                    FileVisitOption.FOLLOW_LINKS).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
