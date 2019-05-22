package algorithm_and_data_structure.a2_stack;

import java.util.Stack;

/**
 * @author: raintor
 * @Date: 2019/1/11 21:09
 * @Description:
 */
public class MyStack<E> implements IStack<E> {

    private MyArray<E> mystack;

    public MyStack(int capacity) {
        mystack = new MyArray<>(capacity);
    }

    public MyStack(){
        mystack = new MyArray<>();
    }

    @Override
    public void Push(E element) {
        mystack.insertLast(element);
    }

    @Override
    public E Pop() {
        return mystack.deleteLast();
    }

    @Override
    public E peek() {
        return mystack.getLast();
    }

    @Override
    public int getSize() {
        return mystack.getSize();
    }

    @Override
    public boolean isEmpty() {
        return mystack.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("当前栈的元素个数=%d \n",mystack.getSize()));
        sb.append("top{");
        for(int i=mystack.getSize()-1;i>=0;i--){
            sb.append(mystack.get(i));
            if(i!=0)
             sb.append(",");

        }
        sb.append("}");
        return sb.toString();
    }
}
