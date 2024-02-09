package Arrays.Striver;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={1,2,4,5};
        System.out.println(missingNumber(nums,5));
    }

    public static int missingNumber(int[] nums,int N) {
        int xor1=0;
        int xor2=0;
        int n=N-1;
        for(int i=0;i<n;i++){
            xor2=xor2^nums[i];
            xor1=xor1^i+1;
       }
        xor1=xor1^N;
        return xor1^xor2; 
    }
}
