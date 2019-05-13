package observer;

/**
 * @ClassName ObserverTest
 * @Description TODO 观察者模式
 * @Author Wangxianglu
 * @Date 2019/5/13 18:10
 * @Version 1.0
 **/
public class ObserverTest {

    public static void main(String[] args) {

        Subject sub = new MySubject();
        sub.add(new ObserverA());
        sub.add(new ObserverB());

        sub.operation();
    }
}
