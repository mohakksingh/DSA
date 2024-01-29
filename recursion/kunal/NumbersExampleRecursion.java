package recursion.kunal;

public class NumbersExampleRecursion {
    
    public static void main(String[] args) {
        //write a func that takes in a number
        //print first 5 numbers

        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }

        //recursive call
        //if you are calling a function again and again , you can treat it as a separate call in stack
        
        //this is called tail recursion
        //this is the last function call
        System.out.println(n);
        print(n+1);
    }
    
}
