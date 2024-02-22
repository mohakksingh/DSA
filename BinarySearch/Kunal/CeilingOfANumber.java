package BinarySearch.Kunal;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        int ans=ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        if(target>letters.length){
            return letters[0];
        }
        int start=0;
        int end=letters.length;

        while (start<end) {
            int mid=start+(end-start)/2;

            if(letters[mid]==target){
                return letters[mid];
            }
            else if(target>letters[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[start];
    }
}

