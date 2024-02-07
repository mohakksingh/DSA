package Arrays.Striver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int[] a={0,0,0,1};
        System.out.println(isSorted(4, a));
    }

    public static int isSorted(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){

            }
            else{
                return -1;
            }
        }
        return 1;   
    }
}
