package com.footprint.mybatis.generator.test.io;

import com.footprint.utils.PathUtils;
import org.junit.Test;

import java.nio.file.Paths;

/**
 * @author hui.zhou 13:48 2018/1/24
 */
public class PathTest {

    @Test
    public void testGet(){
        System.out.println(Paths.get(PathUtils.projectPath()));
    }
}
