package observer;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/13 18:16
 * @Version 1.0
 **/
public interface Subject {

    /**
     * @Author: Wangxianglu
     * @Description:  增加观察者
     * @Date: Created in 18:17 2019/5/13
     */
    void add(Observer observer);

    /**
     * @Author: Wangxianglu
     * @Description:  删除观察者
     * @Date: Created in 18:17 2019/5/13
     */
    void delete(Observer observer);

    /**
     * @Author: Wangxianglu
     * @Description:  通知所有观察者
     * @Date: Created in 18:18 2019/5/13
     */
    void notifyObservers();

    /**
     * @Author: Wangxianglu
     * @Description:  自身的操作
     * @Date: Created in 18:18 2019/5/13
     */
    void operation();
}
