package observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName AbstractSubject
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/13 18:21
 * @Version 1.0
 **/
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = observers.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }
}
