package basicmaths.striver;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        
        int revdigit=0;
        int dup=n;
        while (n>0) {
            int lastdigit=n%10;
            revdigit=(revdigit*10)+ lastdigit;
            n=n/10;
        }
        
        if(revdigit==dup){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
