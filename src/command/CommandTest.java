package command;

/**
 * @ClassName CommandTest
 * @Description TODO 命令模式
 * @Author Wangxianglu
 * @Date 2019/5/16 18:09
 * @Version 1.0
 **/
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
