package Arrays.Striver;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        
    }

    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int preSum=0;int cnt=0;

        for(int i=0;i<nums.length;i++){
            preSum +=nums[i];
            int remove=preSum-k;
            cnt += mpp.getOrDefault(remove,0);
            mpp.put(preSum,mpp.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}
