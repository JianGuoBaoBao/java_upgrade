package thread_learn;

public class StopThread implements Runnable{

    // 测试stop
    // 1.线程正常停止 利用次数，不建议死循环
    // 2.建议使用标志位 设置标志位
    // 3. 不要使用stop或者destroy等过时的jdk方法

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run--------" + i++);
        }
    }

    public void stop(){
        this.flag = false;
        System.out.println("stop--------");
    }


    public static void main(String[] args) {
        StopThread st = new StopThread();
        new Thread(st).start();


        for(int i = 0 ; i < 1000 ; i++){
            System.out.println("man" + i);
            if( i == 900 ){
                st.stop();
            }
        }
    }
}
