package BinarySearch.Kunal;

public class GetFloorAndCeil {
    public static void main(String[] args) {
        
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Write your code here.
        if(x<a[0]){
          return new int[]{-1,a[0]};
        }else if(x>a[n-1]){
          return new int[]{a[n-1],-1};
        }
  
        int start = 0;
      int end = a.length - 1;
  
      while (start <= end) {
          int mid = start + (end - start) / 2;
  
          if (a[mid] == x) {
              return new int[]{a[mid], a[mid]}; 
          } else if (a[mid] < x) {
              start = mid + 1;
          } else {
              end = mid - 1;
          }
      }
      
      return new int[]{a[end], a[start]};
      }
}
