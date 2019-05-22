package algorithm_and_data_structure.a4_link_list.digui;

import org.junit.Test;

/**
 * @author: raintor
 * @Date: 2019/2/28 20:36
 * @Description:
 */
public class LeetCodeDemo {
//    删除链表中等于给定值 val 的所有节点。
//
//    示例:
//
//    输入: 1->2->6->3->4->5->6, val = 6
//    输出: 1->2->3->4->5
    @Test
    public  void testCode(){

    }

    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        head.next=removeElements(head.next,val);
        if(head.val==val)
            return head.next;
        else
            return head;

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
