package algorithm_and_data_structure.a4_link_list;

/**
 * @author: raintor
 * @Date: 2019/2/25 19:37
 * @Description:
 */
public class MLinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

    }

    private Node head;
    private int size;

    public MLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        Node node = new Node(e);
        node.next = head;
        head = node;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new RuntimeException("索引非法");
        if (index == 0)
            addFirst(e);
        else {
            Node pre = head;
            for (int i = 0; i < index - 1; i++) {
                pre = pre.next;   //单向链表在中间位置插入，关键是找到插入位置的前一个Node；
            }
            Node node = new Node(e);
            node.next=pre.next;
            pre.next=node;
        }
        size++;
    }

    public void addLast(E e){
        add(size,e);
    }
}
