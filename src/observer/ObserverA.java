package observer;

/**
 * @ClassName ObserverA
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/13 18:14
 * @Version 1.0
 **/
public class ObserverA implements Observer{

    @Override
    public void update() {
        System.out.printf("observer A received!");
    }
}
