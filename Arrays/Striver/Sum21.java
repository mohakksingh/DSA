package Arrays.Striver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum21 {
    public static void main(String[] args) {
        
    }

    public static String read(int n, int []book, int target){
        // Write your code here.
        Map<Integer,Integer> mpp= new HashMap<>();
        for(int i=0;i<n;i++){
            int a=book[i];
            int more=target-a;
            if(mpp.containsKey(more)){
                return "YES";
            }
            mpp.put(a, i);
        }
        return "NO";    
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int a=nums[i];
            int more=target-a;
            if(mpp.containsKey(more)){
                return new int[]{mpp.get(more),i};
            }
            mpp.put(a,i);
        }
        return new int[] {-1,-1};
    }

    public static String read2(int n, int []book, int target){
        // Write your code here.
        int left=0;
        int right=0;
        Arrays.sort(book);
        while(left<right){
            int sum=book[   left]+book[right];
            if(sum==target){
                return "YES";
            }
            else if(sum<target){
                left++;
            }
            else{
                right++;
            }
        }
        return "NO";
    }
}
