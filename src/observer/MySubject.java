package observer;

/**
 * @ClassName MySubject
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/13 18:24
 * @Version 1.0
 **/
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
