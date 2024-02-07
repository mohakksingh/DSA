package Arrays.Striver;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={4,7,8,6,7,6};
        System.out.println(largestElement(arr, 6));
    }

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
        

    }
}
