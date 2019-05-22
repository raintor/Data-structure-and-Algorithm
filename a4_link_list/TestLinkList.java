package algorithm_and_data_structure.a4_link_list;

import org.junit.Test;

/**
 * @author: raintor
 * @Date: 2019/2/25 20:54
 * @Description:
 */
public class TestLinkList {
    @Test
    public void test1(){
        MLinkedList2<Integer> mll = new MLinkedList2<>();
        for(int i=0;i<5;i++){
            mll.add(i,i);
            System.out.println(mll);
        }
        System.out.println(mll.get(3));
    }

}
