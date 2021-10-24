package LinkedList;

public class RotateLL {
    public static Node rotate(Node head,int k){

        Node temp = head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        Node temp1 = head;
        for(int i=0;i<k-1;i++){
            temp1=temp1.next;
        }

        head=temp1.next;
        temp1.next=null;

        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);

        rotate(head,4);
        }
}
