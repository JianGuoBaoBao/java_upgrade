package thread_learn;

// 插队
public class TestJoinThread implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        TestJoinThread tj = new TestJoinThread();
        Thread thread = new Thread(tj);

        thread.start();

        for(int i = 0; i< 1000; i++){
            if(i == 200){
                thread.join();
            }
            System.out.println("main" + i);
        }
    }


    @Override
    public void run() {
        for(int i = 0; i<100;i++){
            System.out.println("线程vip来了" + i);
        }
    }
}
