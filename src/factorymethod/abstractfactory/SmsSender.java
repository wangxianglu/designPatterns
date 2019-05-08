package factorymethod.abstractfactory;

/**
 * @ClassName SmsSender
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 14:27
 * @Version 1.0
 **/
public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("sms sender");
    }
}
