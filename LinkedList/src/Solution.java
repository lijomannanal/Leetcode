
public class Solution {
	   public ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        

	        
	        while(fast != null && fast.next != null){
		        System.out.println(fast.val);
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
}
