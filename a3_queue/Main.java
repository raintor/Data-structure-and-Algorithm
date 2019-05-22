package algorithm_and_data_structure.a3_queue;

/**
 * @author: raintor
 * @Date: 2019/1/12 21:08
 * @Description:
 */
public class Main {
    public static void main(String[] args){
        MyQueue<Integer> myq  = new MyQueue<>();
        myq.enQueue(10);
        myq.enQueue(11);
        myq.enQueue(12);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        myq.enQueue(13);
        System.out.println(myq);
        myq.deQueue();
        System.out.println(myq);
        myq.deQueue();
        System.out.println(myq);
    }
}
