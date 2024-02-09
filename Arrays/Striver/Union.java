package Arrays.Striver;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 3, 4, 6, 8};
        
        List<Integer> sortedUnion = sortedArray(a, b);
        System.out.println("Sorted Union: " + sortedUnion);
    
    }

    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i]) {
                    Union.add(a[i]);
                }
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j]) {
                    Union.add(b[j]);
                }
                j++;
            }
        }

        while (j < n2) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j]) {
                Union.add(b[j]);
            }
            j++;
        }
        while (i < n1) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i]) {
                Union.add(a[i]);
            }
            i++;
        }

        return Union;
    }

    
}
