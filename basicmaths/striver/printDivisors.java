package basicmaths.striver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printDivisors {
    public static void main(String[] args) {
        factor2(20);
    }
    

    //O(n)
    static void factor1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }   
        }
    }

    //O(sqrt(n))
    static void factor2(int n){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(n/i==i){
                        System.out.print(i+" ");
                    }else{
                        System.out.print(i+" ");
                        list.add(n/i);
                    }
                }
            }
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");

            }
            // return list;
            
    }
}
