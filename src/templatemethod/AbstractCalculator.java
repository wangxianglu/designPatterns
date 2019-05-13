package templatemethod;

import com.sun.deploy.util.StringUtils;

/**
 * @ClassName AbstractCalculator
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/13 17:59
 * @Version 1.0
 **/
public abstract class AbstractCalculator {


    /**
     * @Author: Wangxianglu
     * @Description: 主体方法 实现对本类其他方法的调用
     * @Date: Created in 18:06 2019/5/13
     */
    public final int calculate(String exp, String opt) {
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    /**
     * @Author: Wangxianglu
     * @Description:  被子类重写的方法
     * @Date: Created in 18:06 2019/5/13
     */
    abstract public int calculate(int num1,int num2);



    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
