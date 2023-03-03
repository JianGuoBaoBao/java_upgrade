package com.kuang.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// 反射操作注解
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.kuang.annotation.Student2");

        // 通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 通过注解的value的值
        Tablekuang tablekuang = (Tablekuang)c1.getAnnotation(Tablekuang.class);
        String value = tablekuang.value();
        System.out.println(value);

        // 获得类指定的注解
        Field f = c1.getDeclaredField("name");
        FieldKuang annotation = f.getAnnotation(FieldKuang.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }
}
@Tablekuang("db_student")
class Student2{
    @FieldKuang(columnName = "db_id", type="int" ,length = 10)
    private int id;
    @FieldKuang(columnName = "db_age", type="int" ,length = 10)
    private int age;
    @FieldKuang(columnName = "db_name", type="varchar" ,length = 10)
    private String name;


    public Student2() {

    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablekuang{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldKuang{
    String columnName();
    String type();
    int length();
}

