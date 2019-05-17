package visitor;

/**
 * @ClassName VisitorTest
 * @Description TODO 访问者模式
 * @Author Wangxianglu
 * @Date 2019/5/17 11:03
 * @Version 1.0
 **/
public class VisitorTest {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
