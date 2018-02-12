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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 文档对比以及替换
 * @author hui.zhou 9:29 2018/2/12
 */
public class DocumentCompareAndReplaceUtils {
    static String MAPPER_CLASSPATH = "mybatis/mapper";
    /**
     * 获取新的文档
     * @return
     */
    public static Map<String, Document> parseDocument(){
        Map<String, Document> docMap = new HashMap<>();

        String docPath = FpStringBuilder.buildDefault()
                .append(PathUtils.rootClassPath())
                .append(MAPPER_CLASSPATH).toString();
        Path path = Paths.get(docPath);
        File[] files = path.toFile().listFiles();
        for (File docFile : files){
            docMap.put(docFile.getName(), getDocument(docFile));
        }
        return docMap;
    }

    /**
     * 新的内容替换旧的xml
     * @param newDocMap
     * @param projectPathToReplace 需要替换的工程路径
     *                             例如：D:\worksoft\IntelliJIDEA\workspace\lanmao-ec\lanmao-ec\lanmao-ec-parent\lanmao-ec-service
     */
    public static void replaceDoc(Map<String, Document> newDocMap, String projectPathToReplace){
        String path = FpStringBuilder.buildDefault()
                .append(projectPathToReplace)
                .append(File.separator)
                .append(CommonConstants.MAIN_RESOURCE_PATH)
                .append(File.separator)
                .append(MAPPER_CLASSPATH).toString();
        File dir = Paths.get(path).toFile();
        File[] docs = dir.listFiles();
        for(File docFile : docs){
            Document doc = newDocMap.get(docFile.getName());
            if(Objects.nonNull(doc)){
                try (FileWriter fileWriter = new FileWriter(new File(docFile.getAbsolutePath() + ".temp"))) {
                    //对比两个document，把新增的方法移至新的xml中
                    compareAndReplace(getDocument(docFile), doc);

                    //转化成mybatis的Document对象
                    org.mybatis.generator.api.dom.xml.Document mybatisDoc = convertToMybatisDoc(doc);
                    BufferedWriter writer = new BufferedWriter(fileWriter);
                    writer.write(mybatisDoc.getFormattedContent());
                    writer.flush();
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                new File(docFile.getAbsolutePath()).delete();
                new File(docFile.getAbsolutePath() + ".temp").renameTo(docFile);
            }
        }
    }

    private static org.mybatis.generator.api.dom.xml.Document convertToMybatisDoc(Document doc) {
        //拷贝文档类型
        DocumentType docType = doc.getDocType();
        org.mybatis.generator.api.dom.xml.Document mybatisDoc
                = new org.mybatis.generator.api.dom.xml.Document(docType.getPublicID(), docType.getSystemID());

        //拷贝根节点
        Element rootElement = doc.getRootElement();
        XmlElement answer = new XmlElement("mapper"); //$NON-NLS-1$
        String namespace = rootElement.attributeValue("namespace");
        answer.addAttribute(new Attribute("namespace", namespace));
        mybatisDoc.setRootElement(answer);

        //拷贝子节点
        rootElement.elements().forEach(element -> {
            org.mybatis.generator.api.dom.xml.XmlElement mybatisEle = new XmlElement(element.getName());
            //属性拷贝
            element.attributes().forEach(attribute -> {
                Attribute attr = new Attribute(attribute.getName(), attribute.getValue());
                mybatisEle.addAttribute(attr);
            });

            answer.addElement(mybatisEle);
            //子元素拷贝
            copySubEle(element, mybatisEle);
        });

        return mybatisDoc;
    }

    /**
     * 递归拷贝属性
     * @param element
     * @param mybatisEle
     */
    private static void copySubEle(Element element, XmlElement mybatisEle) {
        element.content().forEach(node -> {
            if(node instanceof Comment){
                return;
            }
            if(node instanceof Text){
                if(!node.getText().trim().equalsIgnoreCase("")){
                    String text = "  " + node.getText().trim();
                    if(text.contains(">")){
                        text = text.replaceAll(">", "&gt;");
                    }else if(text.contains("<")){
                        text = text.replaceAll("<", "&lt;");
                    }
                    mybatisEle.addElement(new TextElement(text));
                }
            }else{
                Element ele = (Element) node;
                XmlElement subMybatisEle = new XmlElement(node.getName());
                ele.attributes().forEach(attribute -> {
                    Attribute attr = new Attribute(attribute.getName(), attribute.getValue());
                    subMybatisEle.addAttribute(attr);
                });

                mybatisEle.addElement(subMybatisEle);
                copySubEle(ele, subMybatisEle);
            }
        });
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

    /**
     * 比较，移动
     * @param src
     * @param desc
     */
    private static void compareAndReplace(Document src, Document desc) {
        Element rootEleSrc = src.getRootElement();
        Element rootEleDesc = desc.getRootElement();
        //替换属性
        rootEleDesc.setAttributes(rootEleSrc.attributes());

        List<Element> elements = rootEleDesc.elements();
        Map<String, Element> idElementMapDesc = new HashMap<>();
        elements.forEach(element -> idElementMapDesc.put(element.attributeValue("id"), element));

        Map<String, Element> idElementMapSrc = new HashMap<>();
        rootEleSrc.elements().forEach(element -> idElementMapSrc.put(element.attributeValue("id"), element));

        //相同element属性覆盖
        idElementMapDesc.forEach((id, ele) -> {
            if(Objects.nonNull(idElementMapDesc.get(id))) {
                ele.setAttributes(idElementMapSrc.get(id).attributes());
            }
        });

        //新增元素移动
        idElementMapSrc.forEach((id, ele) -> {
            if(Objects.isNull(idElementMapDesc.get(id))){
                ele.setParent(null);
                rootEleDesc.add(ele);
            }
        });
    }

    public static void main(String[] args){
        Map<String, Document> docMap = parseDocument();
        replaceDoc(docMap, "D:\\worksoft\\IntelliJIDEA\\workspace\\lanmao-ec\\lanmao-ec\\lanmao-ec-parent\\lanmao-ec-service");
    }
}
