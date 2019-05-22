package algorithm_and_data_structure.b1_sortalgorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: raintor
 * @Date: 2019/4/9 19:06
 * @Description:
 */
public class SelectedSortDemo {
    private void selectSort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minindex]) < 0)
                    minindex = j;
            }
            swap(arr, i, minindex);
        }
    }

    private void swap(Comparable[] arr, int i, int minindex) {
        Comparable temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
    }

    @Test
    public void test(){
        Integer[] arr = new Integer[]{4,7,2,5,1,8,3,9,0};
        selectSort(arr);
        Arrays.stream(arr)
                .forEach(x-> System.out.print(x+" "));
    }
}
