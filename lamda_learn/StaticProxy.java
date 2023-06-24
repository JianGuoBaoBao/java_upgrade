package lamda_learn;

public class StaticProxy {

    public static void main(String[] args) {
//        WeddingCompany weddingCompany = new WeddingCompany(new You());
//        weddingCompany.HappyMarry();

//        weddingCompany =

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();

//        new Thread(()-> System.out.println("i love you")).start();

//        new WeddingCompany(new You()).HappyMarry();
        new WeddingCompany(()-> System.out.println("i love you")).HappyMarry();
    }

}

interface Marry {
    void HappyMarry();
}

// real
//class You implements Marry{
//
//    @Override
//    public void HappyMarry() {
//        System.out.println("要结婚了曹开心");
//    }
//}


// 代理
class WeddingCompany implements Marry{

    private final Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after(){
        System.out.println("布置");
    }

    private void before(){
        System.out.println("收钱");
    }
}