package mediator;

/**
 * @ClassName MyMediator
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 11:26
 * @Version 1.0
 **/
public class MyMediator implements Mediator {


    private User userA;

    private User userB;


    @Override
    public void createMediator() {
        userA = new UserA(this);
        userB = new UserB(this);
    }

    @Override
    public void walkAll() {
        userA.work();
        userB.work();
    }

    public User getUserA() {
        return userA;
    }

    public User getUserB() {
        return userB;
    }


}
