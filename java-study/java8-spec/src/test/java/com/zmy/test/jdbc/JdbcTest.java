package com.zmy.test.jdbc;

import com.mysql.cj.core.MysqlType;
import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * 测试新日期数据类型
 */
public class JdbcTest {

    @Test
    public void testAdd() throws SQLException, ClassNotFoundException {
        Class.forName(Driver.class.getName());
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC",
                "root",
                "123456");
        PreparedStatement statement = conn.prepareStatement("insert into custom(birthday) values(?)");
        statement.setObject(1, LocalDateTime.now(), MysqlType.DATETIME);
        statement.execute();
        statement.close();
        conn.close();
    }

    @Test
    public void testQuery() throws SQLException, ClassNotFoundException {
        Class.forName(Driver.class.getName());
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC",
                "root",
                "123456");
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select birthday from custom where id=4");
        while(resultSet.next()){
            LocalDateTime dateTime = resultSet.getObject("birthday", LocalDateTime.class);
            System.out.println(dateTime);
        }

        conn.close();
    }
}
