
public class Main {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode listnode6 = new ListNode(6);
		ListNode listnode5 = new ListNode(5, listnode6);
		ListNode listnode4 = new ListNode(4, listnode5);
		ListNode listnode3 = new ListNode(3, listnode4);
		ListNode listnode2 = new ListNode(2, listnode3);
		ListNode listFinal = new ListNode(1, listnode2);
		
		ListNode result = s.middleNode(listFinal);
		System.out.println(result.toString());
	}

}
