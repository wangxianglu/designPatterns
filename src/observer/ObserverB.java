package observer;

/**
 * @ClassName ObserverB
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/13 18:14
 * @Version 1.0
 **/
public class ObserverB implements Observer {

    @Override
    public void update() {
        System.out.printf("observer B received!");
    }
}
