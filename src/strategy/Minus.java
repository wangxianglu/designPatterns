package strategy;

/**
 * @ClassName Minus
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/10 17:45
 * @Version 1.0
 **/
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
