package mediator;

/**
 * @ClassName UserB
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 11:28
 * @Version 1.0
 **/
public class UserB extends User {

    public UserB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("userB exe!");
    }
}
