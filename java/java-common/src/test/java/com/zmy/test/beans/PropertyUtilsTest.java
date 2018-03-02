package com.zmy.test.beans;

import com.zmy.beans.AddressBean;
import com.zmy.beans.Employee;
import com.zmy.utils.GsonUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author hui.zhou 14:48 2018/2/9
 */
public class PropertyUtilsTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Employee employee = new Employee();
        employee.setFirstName("abc");
        employee.setLastName("efg");

        AddressBean addressBean = new AddressBean();
        addressBean.setDetail("abcdefghijk");
        employee.setAddress(addressBean);

        employee.setAddresses(new AddressBean[]{addressBean});
        //-------------------------------------
        //---------------分割线-----------------
        //-------------------------------------
        PropertyUtils.getIndexedProperty(employee, "addresses[0]");
        PropertyUtils.getIndexedProperty(employee, "addresses", 0);
        //Map<字段，值> 外加一个class
        Map<String, Object> map = PropertyUtils.describe(employee);

        //map字段
        PropertyUtils.getMappedProperty(employee, "map(name)");
        PropertyUtils.getMappedProperty(employee, "map", "name");

        //嵌套字段获取
        PropertyUtils.getNestedProperty(employee, "address.detail");
        PropertyUtils.getNestedProperty(employee, "addresses[0].detail");

        //获取所有方法
        PropertyDescriptor[] descriptors = PropertyUtils.getPropertyDescriptors(employee);
        for (PropertyDescriptor descriptor : descriptors) {
            System.out.println(descriptor.getPropertyType().getName());
        }

        //获取get方法
        Method getMethod = PropertyUtils.getReadMethod(PropertyUtils.getPropertyDescriptor(employee, "lastName"));
        System.out.println(getMethod.invoke(employee));

        Method setMethod = PropertyUtils.getWriteMethod(PropertyUtils.getPropertyDescriptor(employee, "lastName"));
        setMethod.invoke(employee, "zh");
        System.out.println(getMethod.invoke(employee));
    }
}
