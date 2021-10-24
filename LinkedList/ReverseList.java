package LinkedList;

public class ReverseList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode temp = null;
        ListNode prev=null;

        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        head=prev;

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
        return head;
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        
        SinglyLinkedListNode temp=null;
        SinglyLinkedListNode prev=null;
        if(head==null){
            return head;
        }
        while(head!=null){
            temp=head.next;
            head.next=prev;
            head=prev;
            temp=head;
        }       
            head=prev;
            
            SinglyLinkedListNode temp1=head;
        while(temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
            return head;
    }

    public static void main(String[] args) {
        ListNode head1= new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(3);
        head1.next.next.next=new ListNode(4);
        System.out.println(reverse(head1));
    }
}
