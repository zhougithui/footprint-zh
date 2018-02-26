package zh.footprint.zmy;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 覆盖增删改查生成Plugin
 */
public class CurdPlugin extends PluginAdapter {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /** 
     * 生成mapping 添加自定义sql 
     */  
    @Override  
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getTableConfiguration().getTableName();// 数据库表名
        XmlElement parentElement = document.getRootElement();
          
        // 添加序列
        /*XmlElement sql = new XmlElement("sql");
        sql.addAttribute(new Attribute("id", "TABLE_SEQUENCE"));
        sql.addElement(new TextElement(tableName + "_SEQ.nextval"));
        parentElement.addElement(sql);*/

        //自定义插入
        InsertElementGenerator.addElements(parentElement, introspectedTable, context);
        InsertSelectiveElementGenerator.addElements(parentElement, introspectedTable, context);
        DeleteByPrimaryKeyElementGenerator.addElements(parentElement, introspectedTable, context);
        UpdateByPrimaryKeyWithoutBLOBsElementGenerator.addElements(parentElement, introspectedTable, context);
        UpdateByPrimaryKeySelectiveElementGenerator.addElements(parentElement, introspectedTable, context);
        SimpleSelectByPrimaryKeyElementGenerator.addElements(parentElement, introspectedTable, context);
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapDeleteByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement element,
                                                                        IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean validate(List<String> arg0) {
        return true;  
    }

    /**
     * 生成mapper xml文件并替换项目现有
     * @param args
     */
    public static void main(String[] args) {
        //生成新的mapper文件
        String config = CurdPlugin.class.getClassLoader().getResource("generatorConfig-main.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" };
        ShellRunner.main(arg);

        String projectPath = "D:\\worksoft\\IntelliJIDEA\\workspace\\lanmao-ec\\lanmao-ec\\lanmao-ec-parent\\lanmao-ec-service";
        //新的mapper替换现有的xml文件
        XmlCompareAndReplaceUtils.replaceDoc(projectPath);
        //替换java文件
        JavaCompareAndReplaceUtils.replaceJavaFile(projectPath);
    }  
}  