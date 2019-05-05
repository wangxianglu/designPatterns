package factorymethod.general;

/**
 * @ClassName FactoryTest
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 13:10
 * @Version 1.0
 **/
public class FactoryTest {

    public static void main(String[] args) {

        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}