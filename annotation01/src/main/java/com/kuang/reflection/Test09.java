package com.kuang.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 分析性能问题
public class Test09 {
    // 普通方式调用
    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i <100000000; i++){
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次：" + (endTime - startTime)+ "ms");

    }

    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName",null);
        long startTime = System.currentTimeMillis();

        for(int i = 0; i <100000000; i++){
            getName.invoke(user,null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次：" + (endTime - startTime)+ "ms");
    }

    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName",null);
        getName.setAccessible(true);

        long startTime = System.currentTimeMillis();

        for(int i = 0; i <100000000; i++){
            getName.invoke(user,null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("关闭检测后反射方式执行10亿次：" + (endTime - startTime)+ "ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();

//        普通方式执行10亿次：4ms
//        反射方式执行10亿次：360ms
//        关闭检测后反射方式执行10亿次：165ms
    }

}
