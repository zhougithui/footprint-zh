package com.lanmao.data.sync.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * maper/entity信息服务
 * @author hui.zhou 9:15 2018/3/12
 */
@Service
public class JobInfoService implements InitializingBean {
    @Resource
    @Qualifier("sqlSessionFactoryDB2")
    private SqlSessionFactory sessionFactoryDB2;
    private Map<String, Class<?>> mapperMapDB2 = new HashMap<>();

    /**
     * 列表显示任务名称
     * @return
     */
    public Set<String> queryAllJob(){
        return mapperMapDB2.keySet();
    }

    public Class<?> getMapperClsDB2(String jobName){
        return mapperMapDB2.get(jobName);
    }

    //-------------------------------------
    //---------------分割线-----------------
    //-------------------------------------
    @Resource
    @Qualifier("sqlSessionFactory")
    private SqlSessionFactory sessionFactory;
    private Map<String, Class<?>> mapperMap = new HashMap<>();
    private Map<String, Class<? extends Object>> entityClsMap = new ConcurrentHashMap<>();

    public Class<?> getMapperClsOracle(String jobName){
        return mapperMap.get(jobName);
    }

    public Class<?> getEntityCls(String jobName){
        return entityClsMap.get(jobName);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        Collection<Class<?>> mappersDB2 = sessionFactoryDB2.getConfiguration().getMapperRegistry().getMappers();
        for(Class<?> cls : mappersDB2){
            mapperMapDB2.put(cls.getSimpleName().replace("EntityMapper", ""), cls);
        }

        Collection<Class<?>> mappers = sessionFactory.getConfiguration().getMapperRegistry().getMappers();
        for(Class<?> cls : mappers){
            String jobName = cls.getSimpleName().replace("EntityMapper", "");
            mapperMap.put(jobName, cls);
            String entityName = cls.getSimpleName().replace("Mapper", "");
            try {
                entityClsMap.put(jobName, Class.forName("com.lanmao.data.sync.dao.entity." + entityName));
            } catch (ClassNotFoundException e) {

            }
        }
    }


    private static Pattern humpPattern = Pattern.compile("[A-Z]");

    private static Map<String, String> tableNameMap = new ConcurrentHashMap<>();

    /**
     * 驼峰转下划线
     **/
    public static String humpToLine(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public String getTableName(String jobName){
        String tableName = tableNameMap.get(jobName);
        if(StringUtils.isBlank(tableName)){
            tableName = "t" + humpToLine(jobName);
            tableNameMap.put(jobName, tableName);
        }
        return tableName;
    }

}
