package factorymethod.abstractfactory;

/**
 * @ClassName SendMailFactory
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 14:30
 * @Version 1.0
 **/
public class SendMailFactory implements Provider{

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
