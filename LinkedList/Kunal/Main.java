package LinkedList.Kunal;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LL list= new LL();
        // list.insertFirst(3);
        // list.insertFirst(6);
        // list.insertFirst(7);
        // list.insertFirst(8);
        // list.insertLast(99);
        // list.insert(100, 3);
        // list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();
        // DoublyLL list= new DoublyLL();
        // list.insertFirst(3);
        // list.insertFirst(6);
        // list.insertFirst(7);
        // list.insertFirst(8);
        // list.insertLast(99);
        // list.insert(99, 10);
        // list.display();

        CircularLL list=new CircularLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.delete(19);
        list.display();
        
    }
}
