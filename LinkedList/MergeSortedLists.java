package LinkedList;
class ListNode{
    int val;
    ListNode next;

    ListNode(int val) { this.val = val; }     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null){
            return l2;
        }

        if(l2==null){
            return l2;
        }
//ListNode temp=null;
       
            if(l1.val<l2.val){
                //temp=l1;
                l1.next=mergeTwoLists(l1.next, l2);
                return l1;
            }
            else 
            //(l2.val<l1.val){
                {
            //    temp=l2;
                l2.next=mergeTwoLists(l1, l2.next);
                return l2;
            }
          
    }

    public static void main(String[] args) {
        ListNode head1= new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(4);

        ListNode head2= new ListNode(1);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(4);

        ListNode temp= mergeTwoLists(head1,head2);

        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
