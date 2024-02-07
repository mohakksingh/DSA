package Arrays.Kunal;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println(maxRange(arr,2,3));
    }

    //imagine that array is not empty
    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    //work on edge cases here
    static int maxRange(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }

        if(arr==null){
            return -1;
        }

        int maxVal=arr[0];
        for (int i = start; i <=end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
