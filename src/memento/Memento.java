package memento;

/**
 * @ClassName Memento
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/17 10:51
 * @Version 1.0
 **/
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
