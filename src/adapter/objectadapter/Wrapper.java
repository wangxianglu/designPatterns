package adapter.objectadapter;

import adapter.classadapter.Source;
import adapter.classadapter.TargetTable;

/**
 * @ClassName Wrapper
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/7 17:52
 * @Version 1.0
 **/
public class Wrapper implements TargetTable{

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void methodA() {
        source.methodA(); //调用A
    }

    @Override
    public void methodB() {
        System.out.printf("this is b method");
    }
}
