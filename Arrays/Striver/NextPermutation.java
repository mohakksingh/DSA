package Arrays.Striver;

import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        
    }
     public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int n=A.size();
        int ind=-1;
        for(int i=n-2;i>=0;i--){
                if(A.get(i)<A.get(i+1)){
                    ind=i;
                    break;
                }
            }

        if(ind == -1){
            Collections.reverse(A);
            return A;
        }

        for(int i=n-1;i>ind;i--){
            if(A.get(i)>A.get(ind)){
                Collections.swap(A, i, ind);
                break;
            }
        }
        List<Integer> subList=A.subList(ind+1, n);
        Collections.reverse(subList);
        return A;
    }
}
