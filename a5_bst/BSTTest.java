package algorithm_and_data_structure.a5_bst;

import org.junit.Test;

/**
 * @author: raintor
 * @Date: 2019/3/12 21:26
 * @Description:
 */
public class BSTTest {
    @Test
    public void testBST(){
        BST<Integer> bst = new BST<>();
        bst.add(6);
        bst.add(9);
        bst.add(3);
        bst.add(7);
        bst.add(4);
        bst.preorder();
        bst.remove(9);
        System.out.println("======");
        bst.middleorder();
    }
}
