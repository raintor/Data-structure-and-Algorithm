package algorithm_and_data_structure.a4_link_list.DoubleLinkedList;

/**
 * @author: raintor
 * @Date: 2019/2/28 20:46
 * @Description:
 */
public class DoubleLinkedList<E> {
    private class Node{
        public E e;
        public Node next,pre;

        public Node(E e, Node next, Node pre) {
            this.e = e;
            this.next = next;
            this.pre = pre;
        }

        public Node(E e) {
            this(e,null,null);
        }

        public Node(){
            this(null,null,null);
        }
    }

    private Node head;
    private int size;

    public DoubleLinkedList(){
        head=new Node();
        size=0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void add(int index,E e){
        Node node = head;
        for(int i = 0;i<index;i++)
            node=node.next;
        Node newnode = new Node(e);
        newnode.next=node.next;
        node.next.pre = newnode;
        node.next=newnode;
        newnode.pre=node;
        size++;
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void addLast(E e){
        add(size-1,e);
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("head->");
        Node node = head;
        while (node!=null){
            s.append(node.next.e);
            s.append("->");
            node = node.next;
        }
        return s.toString();

    }


}
