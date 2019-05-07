package adapter;

import adapter.classadapter.Adapter;
import adapter.classadapter.Source;
import adapter.classadapter.TargetTable;
import adapter.objectadapter.Wrapper;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/6 10:39
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        // 类适配器
        TargetTable table = new Adapter();

        table.methodA();

        table.methodB();

        //对象适配器
        Source source = new Source();

        TargetTable targetTable = new Wrapper(source);

        targetTable.methodA();

        targetTable.methodB();

    }
}
