package iterator;

/**
 * @ClassName Collection
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/16 11:06
 * @Version 1.0
 **/
public interface Collection {

    Iterator iterator();

    //获取集合元素
    Object get(int i);

    // 获取集合大小
    int size();
}
