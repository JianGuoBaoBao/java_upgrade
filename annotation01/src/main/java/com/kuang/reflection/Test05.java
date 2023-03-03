package com.kuang.reflection;

public class Test05 {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("main被加载");
        // Son son = new Son();
        /*
            main被加载
            Fathor,static被加载
            Son,static被加载
            Fathor,构造方法被加载
            Son,构造方法被加载
        */


         Class a = Class.forName("com.kuang.reflection.Fathor");
        /*
            main被加载
            Fathor,static被加载
            Son,static被加载
        */

//        System.out.println(Son.numFathor);
        /*
            main被加载
            Fathor,static被加载
            100
         */

    }
}


class Son extends Fathor{

    static int numSon = 0;

    static {
        System.out.println("Son,static被加载");
    }

    Son(){
        System.out.println("Son,构造方法被加载");
    }

}

class Fathor{
    static int numFathor = 100;
    int num = 500;
    static {
        System.out.println("Fathor,static被加载");
    }

    Fathor(){
        System.out.println("Fathor,构造方法被加载");
    }
}
