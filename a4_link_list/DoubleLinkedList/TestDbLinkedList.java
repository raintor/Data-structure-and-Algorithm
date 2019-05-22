package algorithm_and_data_structure.a4_link_list.DoubleLinkedList;

import org.junit.Test;

/**
 * @author: raintor
 * @Date: 2019/2/28 21:01
 * @Description:
 */
public class TestDbLinkedList {
    @Test
    public void test(){
        DoubleLinkedList<Integer> db = new DoubleLinkedList<>();
        db.addFirst(1);
        db.addLast(2);
        db.addLast(3);
        System.out.println(db);
    }
}
