package command;

/**
 * @ClassName MyCommond
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/16 18:11
 * @Version 1.0
 **/
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
