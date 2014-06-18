
public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode result = new ListNode(0);
		result.next = head;
		ListNode head2 = head.next;
		head.next = null;
		
		while(head2 != null){
			ListNode current = head2;
			head2 = head2.next;
			ListNode iter = null;
			for(iter = result; iter.next != null; iter = iter.next){
				if(iter.next.val > current.val){
					break;
				}
			}
			current.next = iter.next;
			iter.next = current;
		}
		return result.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static class ListNode {
    	int val;
    	ListNode next;
    	
    	ListNode(int x){
    		val = x;
    		next = null;
    	}
    }
}
