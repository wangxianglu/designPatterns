package bridge;

/**
 * @ClassName SourceableSubA
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/8 10:49
 * @Version 1.0
 **/
public class SourceableSubA implements Sourceable{

    @Override
    public void method() {
        System.out.println("this is methodA");
    }
}
