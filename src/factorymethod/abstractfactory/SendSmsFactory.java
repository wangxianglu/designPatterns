package factorymethod.abstractfactory;

/**
 * @ClassName SendSmsFactory
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/5 14:31
 * @Version 1.0
 **/
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
