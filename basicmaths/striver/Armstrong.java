package basicmaths.striver;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        
        int dup = n;
        int sum=0;
        while (n > 0) {
            
            int lastDigit = n % 10;

            n = n / 10;
            sum +=  lastDigit*lastDigit*lastDigit;
        }
        if(sum==dup){
            System.out.println("true");
        }       
        else{
            System.out.println("false");
        }

        // if (sum == dup) {
        //     System.out.println("true");
        // } else {
        //     System.out.println("false");
        // }
    }
}
