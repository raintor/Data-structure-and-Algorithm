package algorithm_and_data_structure.a4_link_list.queue;

/**
 * @author: raintor
 * @Date: 2019/2/25 21:27
 * @Description:
 */
public class LinkedListQueue<E> implements IQueue<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }
    }

    private int size;
    private Node head,tail;

    public LinkedListQueue() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public void enQueue(E element) {
        if(tail==null){
            Node node = new Node(element);
            tail=node;
            head=tail;
        }else{
            tail.next=new Node(element);
            tail=tail.next;
        }
        size++;

    }

    @Override
    public E deQueue() {
        Node node = head;
        head = node.next;
        node.next=null;
        if(head==null)
            tail=null;
        size--;
        return node.e;

    }

    @Override
    public E getFront() {
        return head.e;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int getSize() {
        return size;
    }
}
