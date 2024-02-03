package recursion.striver;

import java.util.ArrayList;
import java.util.List;

public class nameprint {
    public static void main(String[] args) {
        System.out.println(printNamesList(4));
    }

    public static void printNames(int n){
        if(n==0){
            return; 
        }
        System.out.print("Coding Ninjas ");
        printNames(n-1);
    }


    public static List<String> printNamesList(int n){
        List<String> ans= new ArrayList<>();
        if(n==0){
            return ans;
        }
        if(n<0){
            System.out.println("Coding ninjas");
            return ans;
        }
        for(int i=0;i<n;i++){
            ans.add("Coding Ninjas");
        }
        return ans;
    }

    
}

