package memento;

/**
 * @ClassName Original
 * @Description TODO 原始类
 * @Author Wangxianglu
 * @Date 2019/5/17 10:50
 * @Version 1.0
 **/
public class Original {

    private String value;

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(this.value);
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
