package com.footprint.mybatis.generator.test.dynamictinvoke;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.List;

/**
 * 在JDK7中，Java提供了对动态语言特性的支持，实现了JSR 292 《Supporting Dynamically Typed Languages on the Java Platform》规范，
 *      这是Java语言发展的一重大进步，而提供对动态语言特性支持也是Java发展的一大趋势与方向。
 *      那么动态性表现在哪里呢？其一在Java API层面，新增了java.lang.invoke包，
 *      主要包含了CallSite、MethodHandle、MethodType等类；其二，在Java字节码指令层面，
 *      新增了invokedynamic指令，而伴随invokedynamic指令新增而在Class类文件常量池中
 *      新增了CONSTANT_InvokeDynamic_info, CONSTANT_MethodHandle_info,
 *
 * CONSTANT_MethodType_info常量表、新增BootstrapMethods属性表。
 *      那么什么是动态性，与动态相对的即是静态。大家应该都听说过，
 *      Java是一门静态型语言(C++也是)，而动态型语言有Groovy、JavaScript、
 *      Ruby、Phthon、PHP、Lisp等等。从这个列举中可以发现，动态语言一大堆，
 *      而静态语言最常见的就是Java和C++了，这也从侧映证了动态性是语言发展的趋势。
 *      这些动态型语言在语言语法层面上最大的特点就是变量用var/def声明；而是Java中，
 *      声明变量时必须指定该变量的类型，如：String name = "zhangsan"。
 *      从深层次一点来讲，动态型语言声明的变量在编译期无法确定该变量的具体类型，
 *      只有到了运行时才能确定该变量的具体类型，而静态型语言，变量的具体类型(这里指变量静态类型，
 *      多态性不包含在此)在编译期就已经确定，以Java为例：声明了一个实例变量，
 *      经过编译器编译后，该变量的简单名称和描述符符号引用都已经存储在了Class文件字节码中，
 *      在类的解析阶段，虚拟机就会将变量的符号引用解析为直接引用。
 *      这个直接引用将会解析为什么类型，在编译期就已经确定了
 */
public class MethodHandleTest {

    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mh = lookup.findStatic(MethodHandleTest.class, "doubleVal", MethodType.methodType(int.class, int.class));
        List<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5);
        MethodHandleTest.transform(dataList, mh);// 方法做为参数  
        for (Integer data : dataList) {
            System.out.println(data);//2,4,6,8,10  
        }
    }

    public static List<Integer> transform(List<Integer> dataList, MethodHandle handle) throws Throwable {
        for (int i = 0; i < dataList.size(); i++) {
            dataList.set(i, (Integer) handle.invoke(dataList.get(i)));//invoke  
        }
        return dataList;
    }

    public static int doubleVal(int val) {
        return val * 2;
    }
}  