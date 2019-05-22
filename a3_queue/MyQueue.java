package algorithm_and_data_structure.a3_queue;

/**
 * @author: raintor
 * @Date: 2019/1/12 20:17
 * @Description:
 */
public class MyQueue<E> implements IQueue<E> {
    private int size;
    private E[] arr = null;
    private int front;
    private int end;

    public MyQueue(int capacity) {
        arr = (E[]) new Object[capacity];
        size = 0;
        front = 0;
        end = 0;
    }

    public MyQueue() {
        this(10);
    }


    @Override
    public void enQueue(E element) {
        if ((end + 1) % arr.length == front)
            resize();
        arr[end] = element;
        end = (end + 1) % arr.length;
        size++;
    }

    private void resize() {
        E[] newarr = (E[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++)
            newarr[i] = arr[(i + front) % arr.length];
        arr = newarr;
        front = 0;
        end = size;
    }

    @Override
    public E deQueue() {
        if (isEmpty())
            throw new RuntimeException("当前队列是空");
        E data = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        if (size == arr.length / 4 && arr.length / 2 != 0)
            deSize();
        return data;
    }

    private void deSize() {
        E[] newar = (E[]) new Object[arr.length / 2];
        for (int i = 0; i < size; i++)
            newar[i] = arr[(i + front) % arr.length];
        front = 0;
        end = size;
        arr = newar;
    }

    @Override
    public E getFront() {
        return arr[front];
    }

    @Override
    public boolean isEmpty() {
        return front == end;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("this is Queue,it size=%d\n", getSize()));
        sb.append("front[");
        for (int i = front; i%arr.length!=end; i++) {
            sb.append(arr[i % arr.length]);
            if (i != end-1)
                sb.append(",");
        }
        sb.append("]tail");
        return sb.toString();
    }
}
