package visitor;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 11:06
 * @Version 1.0
 **/
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();
}
