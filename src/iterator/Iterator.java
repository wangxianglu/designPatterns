package iterator;

/**
 * @ClassName Iterator
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/16 11:07
 * @Version 1.0
 **/
public interface Iterator {

    //前移
    Object previous();

    // 后移
    Object next();

    boolean hasNext();

    // 获取第一个元素
    Object first();
}
