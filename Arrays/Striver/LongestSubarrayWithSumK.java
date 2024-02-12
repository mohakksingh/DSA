package Arrays.Striver;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        
    }

    public static int longestSubarrayWithSumK(int []a, long k) {
        int left=0;
        int right=0;
        int n=a.length;
        int maxLen=0;
        long sum=a[0];

        while (right<n) {
            while(left<=right && sum>k){
                sum -=a[left];
                left--;
            }
            if(sum==k){
                maxLen=Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<n){
                sum += a[right];
            }
        }
        return maxLen;
    }

}
