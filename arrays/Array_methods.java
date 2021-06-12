package arrays;

import java.util.*;

public class Array_methods {

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 6, 20, 13, 5};
        Arr1.printArray(a, 7);
        
        //double pivot quicksort O(nlogn)
        Arrays.sort(a);
        Arr1.printArray(a, 7);
        
        Integer[] ab =new Integer[]{2, 7, 11, 6, 20, 13, 5};
        Arrays.sort(ab,Collections.reverseOrder());
        Arr1.printArray(ab, 7);
        
        Arrays.fill(ab,0);
        Arr1.printArray(ab, 7);
        
    }
}
