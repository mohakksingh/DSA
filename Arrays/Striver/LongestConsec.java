package Arrays.Striver;

import java.util.HashSet;
import java.util.Set;

public class LongestConsec {
    public static void main(String[] args) {
        
    }

    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n=a.length;
        if(n==0) return 0;
        Set<Integer> st=new HashSet<>();
        for(int num:a){
            st.add(num);
        }
        int longest=1;
        for(int num:st){
            if(!st.contains(num-1)){
                int cnt=1;
                int x=num;
                while(st.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
