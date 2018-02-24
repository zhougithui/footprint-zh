package zh.footprint.zmy;

import com.zmy.constants.CommonConstants;
import com.zmy.utils.FpStringBuilder;
import com.zmy.utils.PathUtils;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * java entity对比以及替换包名
 * @author hui.zhou 9:29 2018/2/12
 */
public class JavaCompareAndReplaceUtils {
    static String MAPPER_CLASSPATH = "mybatis/mapper";

    /**
     * 获取新的文档
     * @return
     */
    private static Map<String, File> parseJavaFile(){
        Map<String, File> docMap = new HashMap<>();

        String docPath = FpStringBuilder.buildDefault()
                .append(PathUtils.rootClassPath().replace("target/classes", CommonConstants.MAIN_RESOURCE_PATH))
                .append(File.separator)
                .append("mybatis").toString();
        Path path = Paths.get(docPath);
        File[] files = path.toFile().listFiles();
        for (File docFile : files){
            if(docFile.isFile()){
                docMap.put(docFile.getName(), docFile);
            }
        }
        return docMap;
    }

    /**
     * 新的内容替换旧的java
     * @param projectPathToReplace 需要替换的工程路径
     *                             例如：D:\worksoft\IntelliJIDEA\workspace\lanmao-ec\lanmao-ec\lanmao-ec-parent\lanmao-ec-service
     */
    public static void replaceJavaFile(String projectPathToReplace){
        Map<String, File> newJavaFileMap = parseJavaFile();

        String path = FpStringBuilder.buildDefault()
                .append(projectPathToReplace)
                .append(File.separator)
                .append(CommonConstants.MAIN_RESOURCE_PATH)
                .append(File.separator)
                .append(MAPPER_CLASSPATH).toString();
        File dir = Paths.get(path).toFile();
        File[] docs = dir.listFiles();
        for(File docFile : docs){
            File javaFile = newJavaFileMap.get(docFile.getName().replace("Mapper.xml", ".java"));
            if(Objects.nonNull(javaFile)){
                Document doc = getDocument(docFile);
                for(Element element : doc.getRootElement().elements()){
                    if("BaseResultMap".equals(element.attribute("id").getValue())){
                        String packageName = element.attribute("type").getValue();
                        String packageLine = "package " + packageName.substring(0, packageName.lastIndexOf(".")) + ";";

                        //替换包名
                        FpStringBuilder sb = FpStringBuilder.buildDefault()
                                .append(projectPathToReplace)
                                .append(File.separator)
                                .append(CommonConstants.MAIN_SRC_PATH)
                                .append(File.separator)
                                .append(packageName.replace(".", File.separator))
                                .append(CommonConstants.JAVA_SUFFIX);
                        String javaFilePath =  sb.toString();
                        try {
                            Files.delete(Paths.get(javaFilePath));

                            File file = new File(javaFilePath);
                            FileWriter fileWriter = new FileWriter(file);
                            BufferedWriter writer = new BufferedWriter(fileWriter);

                            FileReader fileReader = new FileReader(javaFile);
                            BufferedReader reader = new BufferedReader(fileReader);

                            String data = reader.readLine();
                            while (Objects.nonNull(data)){
                                if(data.startsWith("package")){
                                    writer.write(packageLine);
                                }else{
                                    writer.write(data);
                                }

                                data = reader.readLine();
                                if(Objects.nonNull(data)){
                                    writer.newLine();
                                }
                            }

                            writer.flush();

                            writer.close();
                            fileWriter.close();

                            reader.close();
                            fileReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            }
        }
    }

    private static Document getDocument(File docFile) {
        //创建解析器
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(docFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
    }

    public static void main(String[] args){
        replaceJavaFile("D:\\worksoft\\IntelliJIDEA\\workspace\\lanmao-ec\\lanmao-ec\\lanmao-ec-parent\\lanmao-ec-service");
    }
}
