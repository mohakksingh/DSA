package Arrays.Striver;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        
    }

    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        int n=MATRIX.length;
        int m=MATRIX[0].length;
        int left=0;int right=m-1;
        int top=0;int bottom=n-1;
        int[] ans=new int[n*m];
        int index=0;


        while(top<=bottom && left<=right){
            for(int i=left;i<right;i++){
                ans[index++]=MATRIX[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[index++]=MATRIX[i][right];

            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans[index++]=MATRIX[bottom][i];
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans[index++]=MATRIX[i][left];
                }
                left++;
            }
        }
        

        return ans;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;

        ArrayList<Integer> ans=new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return ans;
    }
}
