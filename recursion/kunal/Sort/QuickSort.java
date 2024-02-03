package recursion.kunal.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
    }

    static void quicksort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }

        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=nums[mid];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }

            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }

        //now my pivot is at correct position

        quicksort(nums, low, e);
        quicksort(nums, s, high);
    }
}
