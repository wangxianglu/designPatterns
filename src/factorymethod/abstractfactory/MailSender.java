package factorymethod.abstractfactory;

/**
 * @ClassName MailSender
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 14:27
 * @Version 1.0
 **/
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("mail sender");
    }
}
