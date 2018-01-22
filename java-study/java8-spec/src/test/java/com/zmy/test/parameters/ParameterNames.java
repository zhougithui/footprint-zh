package com.zmy.test.parameters;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 在Java 8中这个特性是默认关闭的，因此如果不带-parameters参数编译上述代码并运行
 * javac -parameters
 * 与直接javac生成的字节码是不一样的
 */
public class ParameterNames {

    public static void main(String[] args) throws Exception {
        Method method = ParameterNames.class.getMethod( "main", String[].class );
        for( final Parameter parameter: method.getParameters() ) {
            System.out.println( "Parameter: " + parameter.getName() );
        }
    }
}