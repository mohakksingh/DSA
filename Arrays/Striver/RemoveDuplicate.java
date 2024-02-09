package Arrays.Striver;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,5,5};
        System.out.println(removeDuplicates(arr, 10));
    }

    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i=0;
        for (int j = 1; j < n; j++) {
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        return i+1;

    }
}
