package algorithm_and_data_structure.a6_Heap_and_PriperQueue;

import org.junit.Test;

/**
 * @author: raintor
 * @Date: 2019/3/16 20:32
 * @Description:
 */
public class TestHeap {
    @Test
    public void test(){
        MaxHeap<Integer> max = new MaxHeap<>();
        Integer[] arr = {2,6,8,3,5,9,1};
        max.Hepify(arr);
//        System.out.println(max);
        while (max.getSize()!=0){
            System.out.print(max.removwMax()+"  ");
        }
    }
}
