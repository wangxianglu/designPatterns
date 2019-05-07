package prototype;

import java.io.*;

/**
 * @ClassName Prototype
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/6 9:57
 * @Version 1.0
 **/
public class Prototype implements Cloneable, Serializable{

    /**
     *  浅复制
     * @Author: Wangxianglu
     * @Description: 
     * @Date: Created in 10:03 2019/5/6
     */
    public Object clone() throws CloneNotSupportedException{
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /**
     * 深复制
     * @Author: Wangxianglu
     * @Description:
     * @Date: Created in 10:06 2019/5/6
     */
    public Object deepClone() throws IOException, ClassNotFoundException{

        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
