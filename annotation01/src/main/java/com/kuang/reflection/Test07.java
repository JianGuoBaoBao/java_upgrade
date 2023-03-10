package com.kuang.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.kuang.reflection.User");

        //User user = new User();
        //c1 = user.getClass();

        // 获取类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        // 获取类的属性
        Field[] fields = c1.getFields(); // 找到public 属性
        fields = c1.getDeclaredFields(); // 找到全部属性

        for(Field field: fields){
            System.out.println(field);
        }

        // 获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        // 获得类的方法
        System.out.println("================================");
        Method[] methods = c1.getMethods(); // 获得本类及其父类的全部public方法
        for(Method method: methods){
            System.out.println("正常的：" + method);
        }
        methods = c1.getDeclaredMethods();
        for(Method method: methods){ // 获得本类的所有方法包含private
            System.out.println(method);
        }

        // 获得指定方法
        // 重载
        Method getName = c1.getMethod("getName",null);
        Method setName = c1.getMethod("setName",String.class);
        System.out.println(getName);
        System.out.println(setName);

        // 获取指定的构造器
        System.out.println("================================================");

        Constructor[] constructors = c1.getConstructors(); // 获得本类和父类public
        for(Constructor constructor: constructors){
            System.out.println(constructor);
        }
        constructors = c1.getDeclaredConstructors(); // 获得
        for(Constructor constructor: constructors){
            System.out.println(constructor);
        }

        // 获得指定的构造器
        Constructor constructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
        System.out.println("指定：" + constructor);
    }
}
