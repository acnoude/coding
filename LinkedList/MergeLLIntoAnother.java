package LinkedList;

public class MergeLLIntoAnother {
    
    public static Node merge(Node head1,Node head2){

        Node temp1=head1;
        Node temp2=head2;
        Node temp1_next;
        Node temp2_next;
        while(temp1.next!=null || temp2.next!=null){
            temp1_next=temp1.next;
            temp2_next=temp2.next;

            temp2.next=temp1_next;
            temp1.next=temp2;
            
            temp1=temp1_next;
            temp2=temp2_next;
        }

        if(temp2!=null){
                temp1=temp2;
                temp1=temp1.next;
        }

        return head1;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);


        Node head1 = new Node(5);
        head1.next=new Node(6);
        head1.next.next=new Node(7);
        head1.next.next.next=new Node(8);

        merge(head,head1);
    }
}
