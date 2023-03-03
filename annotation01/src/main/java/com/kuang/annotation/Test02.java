package com.kuang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test02 {

    @MyAnnotation2(name = "宝宝", age=18)
    public void test() {

    }

    @MyAnnotation3("宝宝二号") // 注解里面唯一值value,可以直接使用
    public void test2() {

    }


}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    // 注解的参数： 参数类型 + 参数名() default;
    String name() default "";
    int age();
    int id() default -1; // 如果默认值为-1 ，代表不存在

    String[] schools() default {"西部开源","清华大学"};
}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}
