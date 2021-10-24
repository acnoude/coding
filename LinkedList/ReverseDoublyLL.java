package LinkedList;

public class ReverseDoublyLL {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
            
        DoublyLinkedListNode temp=head;
        DoublyLinkedListNode prev=null;
        
        // while(head.next!=null){
        //     temp=head.next;
        //     head.next=prev;
        //     temp.prev=temp.next;
        //     temp.next=head;
        //     prev=head;
        //     head=temp;                                                             
        // }


        while(temp!=null){

            DoublyLinkedListNode node = temp.prev;
            temp.prev=temp.next;
            temp.next=node;

            prev=temp;

            temp=temp.prev;
        }

        if(prev!=null){
            head=prev;
        }
        
        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedListNode head= new DoublyLinkedListNode(1);
        head.prev=null;
        head.next= new DoublyLinkedListNode(2);
        head.next.next= new DoublyLinkedListNode(3);
        head.next.prev=head;
        head.next.next.prev=head.next;

        reverse(head);
    }
}
