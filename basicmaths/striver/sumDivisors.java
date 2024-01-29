package basicmaths.striver;

import java.util.Scanner;

public class sumDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        int num=0;
        for(int i=1;i<=n;i++){
            if(i%n==0){
                num=num+i;
            }
        }
        System.out.println(num);

    }

}
