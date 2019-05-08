package proxy;


/**
 * @ClassName Proxy
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/8 10:17
 * @Version 1.0
 **/
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }


    @Override
    public void method() {

        System.out.println("before proxy");

        source.method();

        System.out.println("after proxy");
    }
}
