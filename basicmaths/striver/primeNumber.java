package basicmaths.striver;

public class primeNumber {
    public static void main(String[] args) {
        isPrime(5);
        System.out.println("hey");
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
