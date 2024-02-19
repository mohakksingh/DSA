public class EvenDigits {
    public static void main(String[] args) {
        System.out.println(digits2(23324));
    }
    
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigit=digits(num);
        if(numberOfDigit%2==0){
            return true;
        }
        return false;
    }

    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }

    //count digits in a number
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if (num==0) {
            return 1;
        }
        int count=0;

        while (num>0) {
            count++;
            num=num/10;
        }

        return count;
    }
}
