package bridge;

/**
 * @ClassName Bridge
 * @Description TODO 桥
 * @Author Wangxianglu
 * @Date 2019/5/8 10:51
 * @Version 1.0
 **/
public abstract class Bridge {

    private Sourceable sourceable;

    public void method() {
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
