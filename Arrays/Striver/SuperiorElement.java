package Arrays.Striver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorElement {
    public static void main(String[] args) {
        
    }

    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        ArrayList<Integer> list=new ArrayList<>();
        int n=a.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>maxi){
                list.add(a[i]);
            }
            maxi=Math.max(maxi,a[i]);
        }

        Collections.sort(list);
        return list;
    }
}
