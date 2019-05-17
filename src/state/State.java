package state;

/**
 * @ClassName State
 * @Description TODO 状态类 核心类
 * @Author Wangxianglu
 * @Date 2019/5/17 10:57
 * @Version 1.0
 **/
public class State {

    private String value;

    public void methodA() {
        System.out.println("execute the first opt!");
    }

    public void methodB() {
        System.out.println("execute the second opt!");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
