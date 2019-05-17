package interpreter;

/**
 * @ClassName InterpreterTest
 * @Description TODO 解释器模式
 * @Author Wangxianglu
 * @Date 2019/5/17 11:36
 * @Version 1.0
 **/
public class InterpreterTest {

    public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
