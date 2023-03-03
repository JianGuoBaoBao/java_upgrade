package com.kuang.reflection;

import java.lang.annotation.ElementType;

// 所有类型的ClASS
public class Test03 {
    public static void main(String[] args) {
        Class<Object> objectClass = Object.class; // 类
        Class<Comparable> comparableClass = Comparable.class; // 接口
        Class<String[]> stringClass = String[].class; // 一堆数组
        Class<int[][]> intArrayClass = int[][].class; // 二维数组
        Class<Override> OverrideClass = Override.class; // 注解
        Class<ElementType> ElementTypeClass = ElementType.class; // 枚举
        Class<Integer> IntegerClass = Integer.class;
        Class voidCass = void.class;
        Class classClass = Class.class;


        System.out.println(objectClass.getName());
        System.out.println(comparableClass.getName());
        System.out.println(stringClass.getName());
        System.out.println(intArrayClass.getName());
        System.out.println(OverrideClass.getName());
        System.out.println(ElementTypeClass.getName());
        System.out.println(IntegerClass.getName());
        System.out.println(voidCass.getName());
        System.out.println(classClass.getName());


        // 只要原生类型与维度一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());


    }

}
