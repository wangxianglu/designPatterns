package visitor;

/**
 * @ClassName MySubject
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 11:08
 * @Version 1.0
 **/
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
