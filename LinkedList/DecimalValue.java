package LinkedList;

public class DecimalValue {
    public static int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count=0,sum=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        for(int i=count-1;i>=0&&head!=null;i--){
            if(head.val==1){
                sum=(int) (sum+ Math.pow(2,i));
            }
            head=head.next;
        }
        return sum;
    }    

    public static void main(String[] args) {
        
        ListNode head= new ListNode(1);
        head.next=new ListNode(0);
        head.next.next=new ListNode(1);
        System.out.println(getDecimalValue(head));
    }
}
