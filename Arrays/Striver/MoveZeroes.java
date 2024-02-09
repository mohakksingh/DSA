package Arrays.Striver;

public class MoveZeroes {
    public static void main(String[] args) {
        
    }

    public static int[] moveZeroBF(int n, int []a) {
        // Write your code here.
        int[] temp=new int[n];
        int nz=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp[nz]=a[i];
                nz++;
            }
        }

        
        for(int i=0;i<nz;i++){
            a[i]=temp[i];
        }


        for(int i=nz;i<n;i++){
            a[i]=0;
        }
        return a;
    }

    public static int[] swap(int[] a,int num1,int num2){
        int temp=a[num1];
        a[num1]=a[num2];
        a[num2]=temp;
        return a;

    }
    public static int[] moveZerosOptimal(int n, int []a) {
    // Write your code here.
    
    int j=-1;
    for(int i=0;i<n;i++){
        if(a[i]==0){
            j=i;
            break;
        }
    }

    if(j==-1){
        return a;
    }
    for(int i=j+1;i<n;i++){
        if(a[i]!=0){
            swap(a, i, j);
            j++;
        }
    }
    return a;
    }
}
