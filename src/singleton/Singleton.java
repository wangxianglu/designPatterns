package singleton;

/**
 * @ClassName Singleton
 * @Description 单例模式
 * @Author Wangxianglu
 * @Date 2019/5/5 14:42
 * @Version 1.0
 **/
public class Singleton {

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton() {}

    /**
     * 此处使用一个内部类来维护单例
     */
    private static class SingletonFactory{

        private static Singleton instance = new Singleton();

    }


    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @return
     */
    public Object readResove() {
        return getInstance();
    }

}
