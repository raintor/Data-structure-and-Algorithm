package algorithm_and_data_structure.a4_link_list.stack;

/**
 * @author: raintor
 * @Date: 2019/1/11 21:07
 * @Description:
 */
public interface IStack<E> {
    void Push(E element);
    E Pop();
    E peek();
    int getSize();
    boolean isEmpty();
}
