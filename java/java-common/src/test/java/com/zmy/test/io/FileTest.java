package com.zmy.test.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author hui.zhou 14:23 2018/2/2
 */
public class FileTest {

    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("temp", ".txt");
        System.out.println("文件路径: "+temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建:");
        out.close();
    }
}
