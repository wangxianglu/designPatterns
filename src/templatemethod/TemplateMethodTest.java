package templatemethod;

/**
 * @ClassName TemplateMethodTest
 * @Description TODO 模板方法模式
 * @Author Wangxianglu
 * @Date 2019/5/10 17:52
 * @Version 1.0
 **/
public class TemplateMethodTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
