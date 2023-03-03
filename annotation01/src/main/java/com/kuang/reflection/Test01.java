package com.kuang.reflection;

public class Test01 {
    public static void main(String[]args) throws ClassNotFoundException{
        // 通过反射获取Class对象
        Class<?> c1 = Class.forName("com.kuang.reflection.User");
        Class<?> c2 = Class.forName("com.kuang.reflection.User");
        Class<?> c3 = Class.forName("com.kuang.reflection.User");
        Class<?> c4 = Class.forName("com.kuang.reflection.User");

        // 一个类在内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}


class User{
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(){

    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
