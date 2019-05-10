package strategy;

/**
 * @ClassName StrategyTest
 * @Description TODO 策略模式
 * @Author Wangxianglu
 * @Date 2019/5/10 17:28
 * @Version 1.0
 **/
public class StrategyTest {

    public static void main(String[] args) {

        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
