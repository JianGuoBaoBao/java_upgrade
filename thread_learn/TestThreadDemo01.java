package thread_learn;

// 创建线程方式一： 继承Thread类， 重写run()方法， 调用start开启线程
// 总结： 线程开启不一定立即执行，由cpu调度
public class TestThreadDemo01 extends Thread{

    public TestThreadDemo01() {

    }

    public void run(){
        for(int i =0;i <2000;i++){
            System.out.println("我在看代码--" +i);
        }
    }

    public static void main(String[] args) {
        // main线程，主线程

        // 创建一个线程对象
        TestThreadDemo01 testThreadDemo01 = new TestThreadDemo01();
        testThreadDemo01.start();

        for(int i = 0;i < 2000;i++){
            System.out.println("我在学习多线程--" + i);
        }
    }
}
