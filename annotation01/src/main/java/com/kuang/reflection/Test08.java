package com.kuang.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("com.kuang.reflection.User");
        // 构造一个对象
        User user = (User) c1.newInstance(); // 本质是调动了类的无参构造器
        System.out.println(user);

        // 通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)constructor.newInstance("秦疆", 1,18);
        System.out.println(user2);


        // 通过反射调用普通方法
        User user3 = (User)c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"狂胜");
        System.out.println(user3);


        // 通过反射操作属性
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");

        // 不能直接操作私有属性，我们需要关闭程序的安全检查，属性或者方法的setAccessible(true)。
        name.setAccessible(true);
        name.set(user4,"狂胜二");
        System.out.println(user4.getName());




    }
}
