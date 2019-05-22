package algorithm_and_data_structure.a4_link_list.stack;

import org.junit.Test;

/**
 * @author: raintor
 * @Date: 2019/2/25 21:21
 * @Description:
 */
public class TestStack {
    @Test
    public void test2(){
        LinkedListStack<Integer> ls = new LinkedListStack<>();
        for(int i=0;i<6;i++){
            ls.Push(i);
            System.out.println(ls);
        }
        for(int i=5;i>=0;i--){
            ls.Pop();
            System.out.println(ls);
        }
    }
}
