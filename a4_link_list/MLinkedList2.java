package algorithm_and_data_structure.a4_link_list;

/**
 * @author: raintor
 * @Date: 2019/2/25 20:10
 * @Description:
 */
public class MLinkedList2<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.e= e;
            this.next=next;
        }

        public Node(E e){
            this.e = e;
            next=null;
        }

        public Node(){
            this(null,null);
        }
    }

    private Node head;
    private int size;

    public MLinkedList2() {
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
        if(index<0||index>size)
            throw new RuntimeException("添加位置索引异常");
        Node pre = head;
        for(int i=0;i<index;i++){
            pre=pre.next;       //添加了虚拟头结点以后，每次注意添加的都是当前位置的下一个，这样的话实际索引与size相差1.
        }
        Node node = new Node(e);
        node.next=pre.next;
        pre.next=node;
        size++;
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void addLast(E e){
        add(size-1 ,e);
    }

    public E get(int index){
        if(index<0||index>=size)
            throw new RuntimeException("添加位置索引异常");
        Node pre = head;
        for(int i = 0;i<index;i++){
            pre = pre.next;
        }
        return pre.next.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    public void set(int index,E e){
        if(index<0||index>=size)
            throw new RuntimeException("添加位置索引异常");
        Node pre = head;
        for(int i=0;i<index;i++)
            pre=pre.next;
        pre.next.e=e;

    }

    public boolean contains(E e){
        Node pre = head;
        while (pre.next!=null){
            if(pre.next.e.equals(e))
                return true;
            pre = pre.next;
        }
        return false;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("head->");
       Node pre = head;
       while(pre.next!=null){
           sb.append(pre.next.e);
           sb.append("->");
           pre=pre.next;
       }
       sb.append("NULL");
       return sb.toString();
    }

    public E remove(int index){
        if(index<0||index>=size)
            throw new RuntimeException("添加位置索引异常");
        Node pre = head;
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        Node node = pre.next;
        pre.next=node.next;
        node.next=null;
        size--;
        return node.e;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }
}
