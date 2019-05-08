package composite;

/**
 * @ClassName CompositeTest
 * @Description TODO 组合模式
 * @Author Wangxianglu
 * @Date 2019/5/8 11:34
 * @Version 1.0
 **/
public class CompositeTest {

    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode nodeB = new TreeNode();
        TreeNode nodeC = new TreeNode();

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");

    }
}
