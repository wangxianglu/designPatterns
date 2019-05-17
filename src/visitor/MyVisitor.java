package visitor;

/**
 * @ClassName MyVisitor
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 11:07
 * @Version 1.0
 **/
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject subject) {

        System.out.println("visit the subject：" + subject.getSubject());
    }
}
