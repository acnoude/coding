package LinkedList;

public class MergeSortedLL {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp=new SinglyLinkedListNode(0);
        SinglyLinkedListNode temp1=temp;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp=head1;
                
                head1=head1.next;
                temp=temp.next;
            }else if(head2.data<head1.data){
                temp=head2;
                
                head2=head2.next;
                temp=temp.next;
            }else{
                temp=head1;
                temp.next=head2;
                
                head1=head1.next;
                head2=head2.next;
                temp=temp.next.next;
            }
           
        }
        
        if(head1!=null){
            while(head1!=null){
                temp=head1;
                temp=temp.next;
                head1=head1.next;
            }
        }
        
        if(head2!=null){
            while(head2!=null){
                temp=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }
                return temp.next;
            }


            public static void main(String[] args) {
                SinglyLinkedListNode l1= new SinglyLinkedListNode(1);
                l1.next=new SinglyLinkedListNode(2);
                l1.next.next=new SinglyLinkedListNode(3);

                SinglyLinkedListNode l2= new SinglyLinkedListNode(0);
                l2.next=new SinglyLinkedListNode(4);
              //  l2.next.next=new SinglyLinkedListNode(4);

                SinglyLinkedListNode l3=  mergeLists(l1,l2);
            }
}
