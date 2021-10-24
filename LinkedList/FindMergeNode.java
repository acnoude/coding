package LinkedList;

public class FindMergeNode {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

            if(head1==null|| head2==null){
                return -1;
            }

            int count1=0;
            int count2=0;


            SinglyLinkedListNode temp1=head1;
            SinglyLinkedListNode temp2=head2;

            while(temp1!=null){
                temp1=temp1.next;
                count1++;
            }

            while(temp2!=null){
                temp2=temp2.next;
                count2++;
            }
            int d=0;
            if(count1>count2){
                d=count1-count2;
                return  getIntersectionNode(d,head1,head2);
            }else{
                d=count2-count1;
                return  getIntersectionNode(d,head2,head1);
            }

          

    }


    private static int solution(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        while(true){
            if(temp1==temp2){
                break;
            }
            temp1=temp1.next;
            temp2=temp2.next;

            if(temp1==null){
                temp1=head1;
            }

            if(temp2==null){
                temp2=head2;
            }
        }

        return temp1.data;
    }

    private static int getIntersectionNode(int d, SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        for(int i=0;i<d;i++){
            if(temp1==null){
                return -1;
            }
                temp1=temp1.next;
        }

        while(temp1!=null && temp2!=null){
            if(temp1.data == temp2.data){
                return temp1.data;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode l1= new SinglyLinkedListNode(1);
        l1.next=new SinglyLinkedListNode(2);
        l1.next.next=new SinglyLinkedListNode(3);

        SinglyLinkedListNode l2= new SinglyLinkedListNode(1);
      //  l2.next=new SinglyLinkedListNode(2);
     //  l2.next.next=new SinglyLinkedListNode(4);


       int n= findMergeNode(l1,l2);
    }
}
