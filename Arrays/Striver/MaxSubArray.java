package Arrays.Striver;

//kadane algorithm

public class MaxSubArray {
    public static void main(String[] args) {
        
    }
    public static long maxSubarraySum(int[] arr, int n) {
        long sum = 0;
        long maxi = Long.MIN_VALUE;
    
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
    
            if (sum > maxi) {
                maxi = sum;
            }
    
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    
        }
}
