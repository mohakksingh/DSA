package BinarySearch.Kunal;

import java.util.Arrays;

public class Exaple {
    public static void main(String[] args) {
        int a[]={3, 4, 4 ,7, 8, 10};
        int[] ans=getFloorAndCeil(a, 6, 2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        if(x>a[a.length-1]){
              return new int[]{-1,-1};
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
