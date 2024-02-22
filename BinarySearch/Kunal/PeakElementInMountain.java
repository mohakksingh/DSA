package BinarySearch.Kunal;

public class PeakElementInMountain {
    public static void main(String[] args) {
        int arr[]={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)+1;
            
            if(arr[mid-1]>arr[mid]){
                end=mid-1;
            }
            else if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
