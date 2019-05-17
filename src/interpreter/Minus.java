package interpreter;

/**
 * @ClassName Plus
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 14:26
 * @Version 1.0
 **/
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNumber1() - context.getNumber2();
    }
}
