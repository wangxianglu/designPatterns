package strategy;

/**
 * @ClassName AbstractCalculator
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/10 17:42
 * @Version 1.0
 **/
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

}
