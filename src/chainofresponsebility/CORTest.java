package chainofresponsebility;

/**
 * @ClassName CORTest
 * @Description TODO 责任链模式
 * @Author Wangxianglu
 * @Date 2019/5/16 17:54
 * @Version 1.0
 **/
public class CORTest {

    public static void main(String[] args) {

        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h2.operator();
    }
}
