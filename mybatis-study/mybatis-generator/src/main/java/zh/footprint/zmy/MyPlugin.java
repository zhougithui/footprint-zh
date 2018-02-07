package zh.footprint.zmy;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.GeneratedKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MyPlugin extends PluginAdapter {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /** 
     * 生成mapping 添加自定义sql 
     */  
    @Override  
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        logger.info("增加自定义sql");
        String tableName = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();// 数据库表名
        List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
        XmlElement parentElement = document.getRootElement();
          
        // 添加序列
        XmlElement sql = new XmlElement("sql");  
        sql.addAttribute(new Attribute("id", "TABLE_SEQUENCE"));
        sql.addElement(new TextElement(tableName + "_SEQ.nextval"));
        parentElement.addElement(sql);

        //自定义插入
        InsertElementGenerator.addElements(parentElement, introspectedTable, context);
        return super.sqlMapDocumentGenerated(document, introspectedTable);  
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return super.sqlMapInsertSelectiveElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapDeleteByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return super.sqlMapDeleteByPrimaryKeyElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement element,
                                                                        IntrospectedTable introspectedTable) {
        return true;
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return super.sqlMapUpdateByPrimaryKeySelectiveElementGenerated(element, introspectedTable);
    }

    public boolean validate(List<String> arg0) {
        return true;  
    }


    public static void generate() {
        String config = MyPlugin.class.getClassLoader().getResource("generatorConfig-main.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" };  
        ShellRunner.main(arg);  
    }  
  
    public static void main(String[] args) {  
        generate();  
    }  
}  