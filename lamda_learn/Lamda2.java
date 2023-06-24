package lamda_learn;

public class Lamda2 {

    public static void main(String[] args) {

//        ILove love = (int a) ->{
//            System.out.println("i love you" + a);
//        };

        // 简化1 ，去除参数类型
//        ILove love = (a) ->{
//            System.out.println("i love you" + a);
//        };

        // 简化2，括号代码只有一行的时候,接口只有一个方法的时候
        ILove love = a ->System.out.println("i love you" + a);
        love.love(520);
    }
}


//class Love implements ILove{
//
//    @Override
//    public void love(int a) {
//
//    }
//}


interface ILove{
    void love(int a);
//    void love2(int a);
}