package Arrays.Striver;

import java.util.ArrayList;

public class Rotate {
    public static void main(String[] args) {
        
    }
    public static int[] reverse(int[] nums,int start,int end){
        while(start<end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
        return nums;
    }
    
    public void rotateright(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr,int start,int end){
        while(start<end){
            int temp=arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start++;
            end--;

        }
        return arr;
    }

    public static ArrayList<Integer> rotateLeft (ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n=arr.size();
        k=k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        return arr;
    
    }
    
    
}
