package algorithm_and_data_structure.a4_link_list.queue;

/**
 * @author: raintor
 * @Date: 2019/1/12 20:14
 * @Description:
 */
public interface IQueue<E> {
    void enQueue(E element);
    E deQueue();
    E getFront();
    boolean isEmpty();
    int getSize();
}
