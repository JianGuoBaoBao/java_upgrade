package thread_learn;

public class TestYieldThread {

    public static void main(String[] args) {
        MyYield my = new MyYield();

        new Thread(my,"a").start();
        new Thread(my,"b").start();
    }
}

class MyYield implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName() + "线程开始");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "线程停止");
    }
}
