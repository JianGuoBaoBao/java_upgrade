package com.kuang.annotation;


import java.lang.annotation.*;

@SuppressWarnings("all")

@MyAnnotation
public class Test01 {

    // 元注解
    // @Target：用于描述注解的使用范围（即：被描述的注解可以用在上面地方）
    // @Retention：表示需要在上面级别保存该注释信息，用于描述注解的生命周期（source < class < runtime）
    // @Documented：说明该注解讲被包含在javadoc中
    // @Inherited：说明子类可以继承父类中的该注解

    @MyAnnotation
    public void test(){
        System.out.println("test");
    }


}

// 自定义注解, Target表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// Retention表示我们的注解可在上面地方还有效
// runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)

// 表示十分讲我们的注解生成在JAVAdoc中
@Documented

// Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
