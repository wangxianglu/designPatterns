package bridge;

/**
 * @ClassName MyBridge
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/8 11:23
 * @Version 1.0
 **/
public class MyBridge extends Bridge {

    public void method() {
        getSourceable().method();
    }
}
