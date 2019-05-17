package state;

/**
 * @ClassName StateTest
 * @Description TODO 状态模式
 * @Author Wangxianglu
 * @Date 2019/5/17 10:56
 * @Version 1.0
 **/
public class StateTest {

    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
