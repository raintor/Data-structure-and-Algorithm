package algorithm_and_data_structure.a6_Heap_and_PriperQueue;

/**
 * @author: raintor
 * @Date: 2019/3/13 19:44
 * @Description:
 */
public class MaxHeap<E extends Comparable<E>> {
    private MyArray<E> myarr;

    public MaxHeap(int capacity) {
        myarr = new MyArray<>(capacity);
    }

    public MaxHeap() {
        myarr = new MyArray<>();
    }

    public int getSize() {
        return myarr.getSize();
    }

    public boolean isEmpty() {
        return myarr.isEmpty();
    }

    //返回一个索引的父亲索引
    public int parentIndex(int index){
        if(index==0)
            throw new RuntimeException("the 0 is root node");
        return (index-1)/2;
    }

    //返回该节点的做孩子节点
    public int leftChildIndex(int index){
        return 2*index+1;
    }

    //返回该节点的右孩子节点
    public int rightChildIndex(int index){
        return 2*index+2;
    }

    //添加元素
    public void add(E e){
        myarr.insertLast(e);
        shiftHeap(myarr.getSize()-1);
    }

    private void shiftHeap(int i) {
        while(i>0&&myarr.get(i).compareTo(myarr.get(parentIndex(i)))>0){
            myarr.swap(i,parentIndex(i));
            i=parentIndex(i);
        }
    }

    /**
     * 取出和删除最大的元素
     */
    //取出最大
    public E getMax(){
        if(myarr.getSize()==0)
            throw new RuntimeException("堆为空");
        return myarr.get(0);
    }

    public E removwMax(){
        E e = getMax();
        myarr.swap(0, myarr.getSize()-1);
        myarr.deleteLast();
        shiftDown(0);
        return e;
    }
    //下沉任意元素：思路：
    //循环次数，左节点不超过元素个数
    //思路：先找出左右孩子最大值，比较，交换
    private void shiftDown(int i) {
        while(leftChildIndex(i)< myarr.getSize()){
            int j = leftChildIndex(i);
            if(rightChildIndex(i)< myarr.getSize()&& myarr.get(rightChildIndex(i)).compareTo(myarr.get(j))>0)
                j++;
            if(myarr.get(i).compareTo(myarr.get(j))>0)
                break;
            myarr.swap(i,j);
            i=j;
        }
    }

    //替换操作：替换最大的元素
    public E replace(E e){
        E ret = getMax();
        myarr.set(0,e);
        shiftDown(0);
        return ret;
    }

    //将一个数据编程最大堆操作
    //思路：从第一个非叶子节点开始进行下沉操作
    //第一个非叶子节点是多少？就是最后一个叶子节点的父节点。
    public void Hepify(E[] arr){
        myarr.changearr(arr);
        for(int i = parentIndex(arr.length-1);i>=0;i--){
            shiftDown(i);
        }
    }

}
