package proxy;

/**
 * @ClassName Source
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/8 10:15
 * @Version 1.0
 **/
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is original method");
    }

}
