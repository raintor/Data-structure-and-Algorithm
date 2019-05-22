package algorithm_and_data_structure.a2_stack;

/**
 * @author: raintor
 * @Date: 2019/1/10 19:42
 * @Description:
 */
public class MyArray<E> implements ArrayInter<E> {

    private int size;
    private E[] arr=null;

    public MyArray(int capcity) {
        size=0;
        arr=(E[])new Object[capcity];
    }

    public MyArray() {
        arr=(E[])new Object[10];
        size=0;
    }

    /**
     * 获取容量
     * @return
     */
    @Override
    public int getCapcity() {
        return arr.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
    public void insertElment(int index,E element){
        if(index<0||index>arr.length)
            throw new RuntimeException("索引异常");
        if(size==arr.length)
            resize();
        for(int i=size;i>index;i--)
            arr[i]=arr[i-1];
        arr[index]=element;
        size++;
    }

    public void insertLast(E element){
        insertElment(size,element);
    }

    public void insertFirst(E element){
        insertElment(0,element);
    }

    public E deleteElement(int index){
        if(index<0||index>arr.length)
            throw new RuntimeException("索引异常");
        if(size==arr.length/4&&arr.length/2!=0)
            desize();
        E temp = arr[index];
        for(int i=index;i<size;i++)
            arr[i]=arr[i+1];
        size--;
        return temp;
    }

    public E deleteLast(){
        return deleteElement(size-1);
    }

    public E deleteFirst(){
        return deleteElement(0);
    }

    public E get(int index){
        if(index<0||index>arr.length)
            throw new RuntimeException("索引异常");
        return arr[index];
    }

    public E getLast(){
        return get(size-1);
    }

    public void set(int index, E element){
        if(index<0||index>arr.length)
            throw new RuntimeException("索引异常");
        arr[index]=element;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("your Array size=%d,capcity=%d\n",size,arr.length));
        sb.append("[");
        for(int i=0;i<size;i++){
            sb.append(arr[i]);
            if(i!=size-1)
                sb.append(" ,");
        }
        sb.append("]");
        return sb.toString();
    }
    private void desize() {
        E[] newarr = (E[])new Object[arr.length/2];

        for(int i=0;i<size;i++)
            newarr[i]=arr[i];
        arr=newarr;
    }

    private void resize() {
        E[] newarr = (E[])new Object[arr.length*2];
        for(int i=0;i<size;i++)
            newarr[i]=arr[i];
        arr=newarr;
    }
}
