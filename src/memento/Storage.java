package memento;

/**
 * @ClassName Storage
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 10:53
 * @Version 1.0
 **/
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
