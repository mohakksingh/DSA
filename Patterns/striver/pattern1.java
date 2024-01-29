package Patterns.striver;

public class pattern1 {
    public static void main(String[] args) {
        printer22(4);
    }

    static void printer(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("* ");

            }
            System.out.println();
        }    
    }
    static void printer2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.println("* ");

            }
            System.out.println();
        }    
    }
    static void printer3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }    
    }
    static void printer4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);

            }
            System.out.println();
        }    
    }
    static void printer5(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printer6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void printer7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++ ){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("* ");
            
            }
            //space
            for(int j=0;j<n-i-1;j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void printer8(int n){

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //space
            for (int j2 = 0; j2 < i; j2++) {
                System.out.print(" ");   
            }
            System.out.println();
        }
    }
    //9 is the combination of 7 and 8
    static void printer10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    static void printer11(int n){

        int start=1;
        for(int i=0;i<n;i++){
            if(i % 2 ==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    static void printer12(int n){

        
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            
            //1st number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2nd number
            for(int j=i;j>=1;j--){  
                System.out.print(j);
            }
            System.out.println();
            space -=2;
        }
    }
    static void printer13(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j < i; j++) {
                System.out.print(num+" ");
                num=num+1;
                
            }
            System.out.println();
        }

    }
    static void printer14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<='A' +i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void printer15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i    -1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        

    }
    static void printer16(int n){
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)('A'+i))+ " ");
          }
          System.out.println();
        }
    }
    static void printer17(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++ ){
                System.out.print(" ");
            }
            //star
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }else{
                    ch--;
                }

            }
            //space
            for(int j=0;j<n-i-1;j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void printer18(int n){

        for(int i=0;i<n;i++){
          
            // Inner loop for printing the alphabets from
            // A + N -1 -i (i is row no.) to A + N -1 ( E in this case).
            for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                
                System.out.print(ch + " ");
            }
            
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line. 
            System.out.println();
        }
    }
    static void printer19(int n){

        int inIs=0;     
        for(int i=0;i<n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inIs;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            inIs+=2;
            System.out.println();
        }

        int esIs=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=esIs;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            esIs-=2;
            System.out.println();


        }


    }
    static void printer20(int n){
        int spaces = 2*n-2;
      
      // Outer loop for printing row.
      for(int i = 1;i<=2*n-1;i++){
          
          // stars for first half
          int stars = i;
          
          // stars for the second half.
          if(i>n) stars = 2*n - i;
          
          //for printing the stars
          for(int j=1;j<=stars;j++){
              System.out.print("*");
          }
          
          //for printing the spaces
          for(int j = 1;j<=spaces;j++){
              System.out.print(" ");
          }
          
          //for printing the stars
          for(int j = 1;j<=stars;j++){
              System.out.print("*");
          }
          
          // As soon as the stars for each iteration are printed, we move to the
          // next row and give a line break otherwise all stars
          // would get printed in 1 line.
          System.out.println();
          if(i<n) spaces -=2;
          else spaces +=2;
      }

    }
    static void printer21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 ||  i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    static void printer22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n-(Math.min(Math.min(top,bottom),Math.min(left,right)))+" ");
            }
            System.out.println();
        }
    }
}
