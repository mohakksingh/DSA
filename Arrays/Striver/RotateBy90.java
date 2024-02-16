package Arrays.Striver;

public class RotateBy90 {
    public static void main(String[] args) {
        
    }

    public static void rotateMatrix(int [][]mat){
        // Write your code here.
        int n=mat.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                int temp=0;
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
        }
    }
}
