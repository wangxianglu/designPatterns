package chainofresponsebility;

/**
 * @ClassName AbstractHandle
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/16 17:57
 * @Version 1.0
 **/
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
