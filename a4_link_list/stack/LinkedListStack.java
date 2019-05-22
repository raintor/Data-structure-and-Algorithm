package algorithm_and_data_structure.a4_link_list.stack;

import algorithm_and_data_structure.a4_link_list.MLinkedList2;

/**
 * @author: raintor
 * @Date: 2019/2/25 21:16
 * @Description:
 */
public class LinkedListStack<E> implements IStack<E> {
    private MLinkedList2<E> mlink;

    public LinkedListStack() {
        this.mlink = new MLinkedList2<>();
    }

    @Override
    public void Push(E element) {
        mlink.addFirst(element);
    }

    @Override
    public E Pop() {
        return mlink.removeFirst();
    }

    @Override
    public E peek() {
        return mlink.getFirst();
    }

    @Override
    public int getSize() {
        return mlink.getSize()-1;
    }

    @Override
    public boolean isEmpty() {
        return mlink.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        sb.append("head->");
        sb.append(mlink);
        return sb.toString();
    }
}
