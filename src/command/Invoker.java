package command;

/**
 * @ClassName Invoker
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/16 18:12
 * @Version 1.0
 **/
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
