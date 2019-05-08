package builder;

import factorymethod.abstractfactory.MailSender;
import factorymethod.abstractfactory.Sender;
import factorymethod.abstractfactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Builder
 * @Description 建造者模式
 * @Author Wangxianglu
 * @Date 2019/5/5 16:39
 * @Version 1.0
 **/
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for(int i=0; i<count; i++){

            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for(int i=0; i<count; i++){

            list.add(new SmsSender());
        }
    }
}


 class BuilderTest {

    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
