package state;

/**
 * @ClassName Context
 * @Description TODO 状态模式切换类
 * @Author Wangxianglu
 * @Date 2019/5/17 10:59
 * @Version 1.0
 **/
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.methodA();
        } else if (state.getValue().equals("state2")) {
            state.methodB();
        }
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}