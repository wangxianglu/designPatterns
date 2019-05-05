package factorymethod.general;

/**
 * @ClassName MailSender
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 11:49
 * @Version 1.0
 **/
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.print("Mail send message");
    }
}
