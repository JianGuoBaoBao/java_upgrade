package thread_learn;

// 创建线程方式2： 实现runnable 接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
public class TestThreadDemo03 implements Runnable{
    public void run(){
        for(int i = 0; i < 200; i++){
            System.out.println("我在看代码---" + i);
        }
    }

    public static void main(String[] args) {
        // 创建runnable接口的实现类对象
        TestThreadDemo03 testThreadDemo03 = new TestThreadDemo03();
        new Thread(testThreadDemo03).start();

        for(int i = 0;i < 1000;i++){
            System.out.println("我在学习多线程--" + i);
        }
    }
}
