package algorithm_and_data_structure.a4_link_list;

/**
 * @author: raintor
 * @Date: 2019/1/12 21:48
 * @Description:
 */
public class LinkListTest {
    public static void main(String[] args){
        MyLink<Integer> mylick = new MyLink<>();
        mylick.add(10);
        mylick.add(11);
        mylick.add(10);
        mylick.add(11);
        mylick.get();
    }
}

class MyLink<E>{
    private Node<E> node;

    public MyLink() {
        node = new Node<>();
        node.next=null;

    }

    public void add(E ele){
        Node<E> newnode = new Node<>();
        if(node.next==null){
            node.next=newnode;
        }else{
            Node<E> temp = node;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
        }
        newnode.element=ele;
    }

    public void get(){
        Node<E> temp=node;
        while (temp!=null){
            System.out.println(temp.element);
            temp=temp.next;
        }
    }
}

class Node<E>{
    public E element;
    public Node<E> next;
}
