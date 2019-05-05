package factorymethod.general;

/**
 * @ClassName SmsSender
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 11:49
 * @Version 1.0
 **/
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.print("SMS send message");
    }
}
