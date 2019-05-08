package decorator;

/**
 * @ClassName DecoratorTest
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/8 10:03
 * @Version 1.0
 **/
public class DecoratorTest {

    public static void main(String[] args) {

        Sourceable sourceable = new Source();
        Sourceable decoratorSource = new Decorator(sourceable);
        decoratorSource.method();
    }
}
