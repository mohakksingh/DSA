package Arrays.Striver;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort012 {
    public static void main(String[] args) {
        
    }
    
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                Collections.swap(arr, low, mid);
                mid++;
                low++;
            }
            else if(arr.get(mid)==1){
                mid++;
            }
            else{
                Collections.swap(arr, mid, high);
                high--;
            }
        }

    }
}
