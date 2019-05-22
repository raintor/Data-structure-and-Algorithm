package algorithm_and_data_structure.a6_Heap_and_PriperQueue;

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
        //不可以直接创建泛型类型的数组，必须创建Object额类型之后进行转化。
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
        if(size==arr.length/4)
            desize();
        E temp = arr[index];
        for(int i=index;i<size-1;i++)
            arr[i]=arr[i+1];
        size--;
        return temp;
    }

    public E deleteLast(){
//        size--;
        return deleteElement(size-1);
    }

    public E deleteFirst(){
//        size--;
        return deleteElement(0);
    }

    public E get(int index){
        if(index<0||index>arr.length)
            throw new RuntimeException("索引异常");
        return arr[index];
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

    public void swap(int i,int k){
        E temp = arr[i];
        arr[i]=arr[k];
        arr[k]= temp;
    }

    public void changearr(E[] marr){
        arr = (E[])new Object[marr.length];
        for(int i=0;i<arr.length;i++)
            arr[i]=marr[i];
        size=marr.length;
    }
}
