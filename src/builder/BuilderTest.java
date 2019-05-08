package builder;

/**
 * @ClassName BuilderTest
 * @Description TODO 建造者模式
 * @Author Wangxianglu
 * @Date 2019/5/8 13:03
 * @Version 1.0
 **/
public class BuilderTest {

    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
