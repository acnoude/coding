package LinkedList;

public class DeleteDUplicate {
    
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
            
        SinglyLinkedListNode temp = head;
           
        while(temp!=null){
        //    boolean flag =false;
            SinglyLinkedListNode temp1=temp;
       while(temp1!=null && temp1.data==temp.data){
                temp1=temp1.next;
        //   flag=true;
       }
            temp.next=temp1;
            temp=temp.next;
        }
        return head;

    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        
        SinglyLinkedListNode temp=null;
        SinglyLinkedListNode prev=null;
        if(head.next==null){
            return null;
        }
        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }       
            head=prev;
            return head;
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp1= new SinglyLinkedListNode(data);
        SinglyLinkedListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
      temp.next=temp1;
       return head;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode l1= new SinglyLinkedListNode(236);
        l1.next=new SinglyLinkedListNode(326);
        l1.next.next=new SinglyLinkedListNode(938);
       // l1.next.next.next=new SinglyLinkedListNode(4);

        insertNodeAtTail(l1,5);
    }
}
