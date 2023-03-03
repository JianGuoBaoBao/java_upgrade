package com.kuang.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        // 一个类在内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中

        // 方式一： 通过对象获取
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());


        // 方式二： forname获取
        Class c2 = Class.forName("com.kuang.reflection.Student");
        System.out.println(c2.hashCode());

        // 方式三： 通过类名获取
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 方式四： 基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4); // int

        // 获取父类类型
        Class c5 = Student.class.getSuperclass();
        System.out.println(c5); // class com.kuang.reflection.Person

    }
}


class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}
