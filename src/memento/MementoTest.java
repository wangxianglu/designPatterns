package memento;

/**
 * @ClassName MementoTest
 * @Description TODO 备忘录模式
 * @Author Wangxianglu
 * @Date 2019/5/17 10:49
 * @Version 1.0
 **/
public class MementoTest {

    public static void main(String[] args) {
        // 创建原始类
        Original origi = new Original("egg");

        // 创建备忘录
        Storage storage = new Storage(origi.createMemento());

        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());
    }
}
