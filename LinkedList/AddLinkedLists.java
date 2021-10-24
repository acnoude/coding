package LinkedList;

public class AddLinkedLists {
  //  static int carry =0; 

    public static ListNode addLinkedList(ListNode n1,ListNode n2){
       
        ListNode prev=null;
        ListNode res=null;
        int carry=0;
        int temp1=0,temp2=0,sum=0;
        while(n1!=null || n2!=null){

             temp1= (n1!=null)? n1.val: 0;
             temp2= (n2!=null)? n2.val: 0;
             sum=temp1+temp2+carry;
             if(sum>9){
                
                carry=1;
            }else{
                carry=0;
            }

            sum=sum%10;
          
            ListNode head = new ListNode(sum);

            if(res==null){
                res=head;
              //  prev=head;
            }else{
                prev.next=head;
            }
            prev=head;

            if(n1!=null){
                n1=n1.next;
            }

            if(n2!=null){
                n2=n2.next;
            }

          

        }
  if(carry>0){
                prev.next=new ListNode(carry);
            }
        return res;
    }


    public static void main(String[] args) {
        ListNode head =new ListNode(9);
        head.next=new ListNode(9);
        head.next.next=new ListNode(9);
        head.next.next.next=new ListNode(9);
        head.next.next.next.next=new ListNode(9);
        head.next.next.next.next.next=new ListNode(9);
        head.next.next.next.next.next.next=new ListNode(9);

        ListNode head1= new ListNode(9);
        head1.next=new ListNode(9);
        head1.next.next=new ListNode(9);
        head1.next.next.next=new ListNode(9);

        addLinkedList(head,head1);

    }
}
