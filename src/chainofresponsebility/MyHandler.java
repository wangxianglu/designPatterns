package chainofresponsebility;

/**
 * @ClassName MyHandle
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/16 17:58
 * @Version 1.0
 **/
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
