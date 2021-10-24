package LinkedList;

public class mergeKll {
    
    public static ListNode reverse(ListNode head){
       
        // while(head!=null){
        //     temp=head.next;
        //     head.next=prev;
        //     prev=head;
        //     head=temp;
        // }
        // head=prev;

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
        return head;
    }

    public static ListNode mergeKlists(ListNode head,int k){

        ListNode temp = null;
        ListNode prev=null;

     //   ListNode temp=head;
int count=0;
        // while(temp!=null){
        //     temp=temp.next;
        //     count++;
        // }
        ListNode curr=head;
       while(count<k && temp!=null){
        temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
        count++;
       }

       if(prev!=null){
           mergeKlists(temp, k);
       }
       return head;

    }
}
