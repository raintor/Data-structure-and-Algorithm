package algorithm_and_data_structure.a1_shunxubiao;

/**
 * @author: raintor
 * @Date: 2019/1/10 20:20
 * @Description:
 */
public class Main {
    public static void main(String[] args){
        MyArray<Integer> myarr = new MyArray<>(10);
        myarr.insertLast(1);
        myarr.insertLast(2);
        myarr.insertLast(3);
        myarr.insertLast(4);
        myarr.insertLast(5);
        myarr.insertLast(6);
        myarr.insertLast(7);
        myarr.insertLast(8);
        myarr.insertLast(9);
        myarr.insertLast(10);
        myarr.insertLast(11);
        myarr.deleteElement(3);
        myarr.deleteElement(3);
        myarr.deleteElement(3);
        myarr.deleteElement(3);
        myarr.deleteElement(3);
        myarr.deleteElement(3);
        myarr.deleteElement(3);
        System.out.println(myarr);

    }
}
