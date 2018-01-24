package zh.footprint.zmy.test.syntax;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hui.zhou 12:44 2018/1/24
 */
public class SyntaxTest {

    /**
     * switch支持String类型
     */
    @Test
    public void testSwitch(){
        String str = "abc";
        switch (str){
            case "a":
                System.out.println(1);
                break;
            case "ab":
                System.out.println(2);
                break;
            case "abc":
                System.out.println(3);
                break;
            default:
                System.out.println("no suit");
        }
    }

    /**
     * 二进制的支持
     */
    @Test
    public void testBinary(){
        int i = 0b010110;
        System.out.println(i);
    }

    /**
     * 数字加下划线更加清晰
     */
    @Test
    public void testNumber(){
        int i = 10_1000;
        System.out.println(i);
    }

    /**
     * 多个异常可以合并
     */
    @Test
    public void testExe(){
        int i = 0B1010;
        try {
            System.out.println(i/0);
            Assert.assertFalse(i == 10);
        } catch ( IllegalArgumentException | ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * 资源释放
     * @throws IOException
     */
    @Test
    public void testReleaseResouce() throws IOException {
        try (BufferedReader reader = new BufferedReader(new CharArrayReader("abcdefghijklmnopqrst".toCharArray()))) {
            StringBuilder builder = new StringBuilder();
            String line = null;
            while((line=reader.readLine())!=null){
                builder.append(line);
                builder.append(String.format("%n"));
            }
            System.out.println(builder.toString());
        }
    }

    /**
     * 对泛型的简化
     */
   @Test
   public void testGeneric(){
       List<String> list = new ArrayList<>();
   }

}
