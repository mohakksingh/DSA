package BinarySearch.Kunal;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={-18,-12,-4,0,2,4,6,7,8};
        int target=6;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }

    static public int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while (start<=end) {
            //find the middle element
            int mid=start+(end-start)/2;//might extend the range of int in java
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
        
    }
}
