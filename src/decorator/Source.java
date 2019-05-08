package decorator;

/**
 * @ClassName Source
 * @Description 被装饰类
 * @Author Wangxianglu
 * @Date 2019/5/8 9:57
 * @Version 1.0
 **/
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is original method");
    }
}
