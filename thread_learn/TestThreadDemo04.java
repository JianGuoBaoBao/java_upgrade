package thread_learn;

// 多个线程同事操作同一个对象
// 买火车票的例子
public class TestThreadDemo04 implements Runnable{

    // 票数
    private int ticketNums = 10;

    public void run(){
        while (true){
            if(ticketNums <=0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"==》拿到了" + ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        TestThreadDemo04 ticket = new TestThreadDemo04();

        new Thread(ticket, "小明").start();
        new Thread(ticket, "老师").start();
        new Thread(ticket, "黄牛").start();

    }
}
