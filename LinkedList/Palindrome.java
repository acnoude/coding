package LinkedList;
import java.util.Stack;

public class Palindrome {
    
    public static boolean isPalindrome(ListNode head) {
       // Stack<Integer> stack = new Stack<>();
        ListNode slow=head;
        boolean ispalin = true; 
        Stack<Integer> stack = new Stack<Integer>(); 
  
        while (slow != null) { 
            stack.push(slow.val); 
            slow = slow.next; 
        } 
  
        while (head != null) { 
  
            int i = stack.pop(); 
            if (head.val == i) { 
                ispalin = true; 
            } 
            else { 
                ispalin = false; 
                break; 
            } 
            head = head.next; 
        } 
        return ispalin; 
    }

    public static void main(String[] args) {
        ListNode head1= new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(1);
        head1.next.next.next=new ListNode(2);
        System.out.println(isPalindrome(head1));
    }


}
