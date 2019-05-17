package mediator;

/**
 * @ClassName MediatorTest
 * @Description TODO 中介者模式
 * @Author Wangxianglu
 * @Date 2019/5/17 11:25
 * @Version 1.0
 **/
public class MediatorTest {

    public static void main(String[] args) {

        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.walkAll();
    }
}
