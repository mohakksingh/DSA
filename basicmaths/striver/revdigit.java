package basicmaths.striver;

import java.util.Scanner;

public class revdigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        
        int revdigit=0;
        while (n!=0) {
            int lastdigit=n%10;
            if(revdigit> Integer.MAX_VALUE/10 || revdigit<Integer.MIN_VALUE/10){
                // return 0;   
            }
            revdigit=(revdigit*10)+lastdigit;   
            n=n/10;
            
        }
        System.out.println(revdigit);

    }
}
