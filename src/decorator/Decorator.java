package decorator;

/**
 * @ClassName DecoratorSource
 * @Description 装饰类
 * @Author Wangxianglu
 * @Date 2019/5/8 9:58
 * @Version 1.0
 **/
public class Decorator implements Sourceable {

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator");
        sourceable.method();
        System.out.println("after decorator");
    }
}
