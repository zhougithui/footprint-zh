package zh.footprint.zmy.test.io;

import com.zmy.utils.PathUtils;
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
