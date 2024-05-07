package LinkedList.Kunal;

public class CycleQuestions {

    //https://leetcode.com/problems/linked-list-cycle/
    public Boolean hasCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow) {
                return true;
            }
        }
        return false;
    }

    //find length
    public int lengthCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow) {
                //calculate the lenght
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    val = x;
    next = null;
        }
 }
