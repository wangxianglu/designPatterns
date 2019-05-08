package factorymethod.abstractfactory;

/**
 * @ClassName AbstractFactoryTest
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 14:32
 * @Version 1.0
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }


}
