package thread_learn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleepThread{


    public static void main(String[] args) {
//        try{
//            tenDown();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        Date startTime = new Date(System.currentTimeMillis());
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis()); // 更新当前时间
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public static void tenDown() throws InterruptedException{
        int num = 10;
        do {
            Thread.sleep(1000);
            System.out.println(num--);
        } while (num > 0);

    }

}
