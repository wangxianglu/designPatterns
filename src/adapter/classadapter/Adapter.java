package adapter.classadapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/6 10:35
 * @Version 1.0
 **/
public class Adapter extends Source implements TargetTable {

    @Override
    public void methodB() {
        System.out.println("this is targetTable method");
    }

}
