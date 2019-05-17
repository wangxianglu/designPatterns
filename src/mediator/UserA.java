package mediator;

/**
 * @ClassName UserA
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 11:28
 * @Version 1.0
 **/
public class UserA extends User {

    public UserA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("userA exe!");
    }
}
