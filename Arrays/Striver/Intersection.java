package Arrays.Striver;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		int i=0;
		int j=0;
		ArrayList<Integer> list=new ArrayList<>();

		while(i<n && j<m){
			if(arr1.get(i)<arr2.get(j)){
				i++;
			}
			else if(arr1.get(i)>arr2.get(j)){
				j++;
			}
			else{
				list.add(arr1.get(i));
				i++;
				j++;
			}

		}
		return list;
	}
}
