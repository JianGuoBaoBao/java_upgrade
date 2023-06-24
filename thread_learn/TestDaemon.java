package thread_learn;

public class TestDaemon {

    public static void main(String[] args) {

        You you  = new You();
        God god = new God();

        Thread thread1 = new Thread(you);
        Thread thread2 = new Thread(god);

        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

    }
}
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝保佑着你");
        }
    }
}

class You implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 36500; i++){
            System.out.println("你一生都开心的活着");
        }
        System.out.println("goodBye world");
    }
}