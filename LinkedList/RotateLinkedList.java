package LinkedList;

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast =null;

        while(temp.next!=null){
            prevLast=temp;
            temp=temp.next;
        }


        for(int i=0;i<k;i++){
            temp.next=head;
            prevLast.next=null;
            temp=head;
        }

        return head;
    }
}
