package mediator;

/**
 * @ClassName User
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 11:27
 * @Version 1.0
 **/
public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator(){
        return mediator;
    }

    public abstract void work();
}
