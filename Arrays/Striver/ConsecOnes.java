package Arrays.Striver;

public class ConsecOnes {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,0,1};
        System.out.println();
    }
    public static int consecutiveOnes(int n, int[] arr) {
		// Write your code here.
		int maxi=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				count++;
				maxi=Math.max(maxi, count);
			}
			else{
				count=0;
			}
	
		}
		return maxi;
	}
}
