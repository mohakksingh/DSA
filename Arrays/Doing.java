package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Doing {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] res=getSecondOrderElements(4, a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
            int max=Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;

            int o=0;
            int p=0;
            
            for(int i=0;i<=n;i++){
                if(a[i]<max){
                    o=max;
                    max=a[i];
                }
                if(a[i]>min){
                    p=min;
                    min=a[i];
                }
            }
            int[] ans={o,p};
            return ans;
    }
    
}
