package iterator;

/**
 * @ClassName IteratorTest
 * @Description TODO 迭代子模式
 * @Author Wangxianglu
 * @Date 2019/5/16 11:00
 * @Version 1.0
 **/
public class IteratorTest {

    public static void main(String[] args) {

        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
