package BinarySearch.Kunal;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[]={-18,-12,-4,0,2,4,6,7,8};
        int target=6;

        int ans=orderAgnosticBS(arr, target);
        System.out.println(ans  );
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc= arr[start]<arr[end];

        while (start<=end) {
            //find the middle element
            int mid=start+(end-start)/2;//might extend the range of int in java
            
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

