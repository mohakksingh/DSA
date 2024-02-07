package Arrays.Kunal;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list=new ArrayList<>(10);

        // list.add(67);
        // list.add(24);
        // list.add(84);
        // list.add(54);
        // list.add(45);
        // list.add(96);

        // System.out.println(list.contains(654));

        // list.set(0, 99);
        // list.remove(2);

        // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    }
}
