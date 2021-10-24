package LinkedList;

public class SortLL {
    public ListNode sortList(ListNode head) {
        
        if(head ==null || head.next==null){
            return head;
        }
        ListNode middle= findMiddle(head);
        ListNode middleNext=middle.next;

        middle.next=null;

        ListNode left= sortList(head);
        ListNode right =sortList(middleNext);


        return mergeSort(left,right);

        
    }

    private ListNode mergeSort(ListNode left, ListNode right) {
       if(left==null){
           return right;
       }

       if(right==null){
           return left;
       }

       ListNode result=null;

       if(left.val<=right.val){
           result =left;
           mergeSort(left.next, right);
       }else{
           result=right;
           mergeSort(left, right.next);
       }

       return result;
    }

    private ListNode findMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow= head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
