package algorithm_and_data_structure.b1_sortalgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * @author: raintor
 * @Date: 2019/4/9 19:13
 * @Description:
 */
public class InsertSortDemo {
    private void insertSort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i;j>0;j--){
                if(arr[j].compareTo(arr[j-1])<0)
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }

    private void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    @Test
    public void test(){
        Integer[] arr = new Integer[]{4,7,2,5,1,8,3,9,0};
        insertSort(arr);
        Arrays.stream(arr)
                .forEach(x-> System.out.print(x+" "));

    }
}
