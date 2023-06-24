package lamda_learn;

// (param) -> expression
public class Lambda {

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambad();

        like = new ILike() {
            @Override
            public void lambad() {

            }
        };

        like = () ->{

        };

    }

}

// 定义一个函数式接口
interface ILike {
    void lambad();
}

class Like implements ILike{

    @Override
    public void lambad() {
        System.out.println("i like java");
    }
}
