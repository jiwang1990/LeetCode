
public class SortList {
	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode walker = head;
		ListNode runner = head;
		while(runner.next != null && runner.next.next != null){
			walker = walker.next;
			runner = runner.next.next;
		}
		ListNode head2 = walker.next;
		walker.next = null;
		ListNode head1 = sortList(head);
		head2 = sortList(head2);
		head = merge(head1, head2);
		return head;
    }
	
	public ListNode merge(ListNode head1, ListNode head2) {
		ListNode head = new ListNode(0);
		ListNode tail = head;
		while(head1 != null && head2 != null){
			if(head1.val < head2.val){
				tail.next = head1;
				head1 = head1.next;
			}else{
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;
		}
		if(head1 == null){
			tail.next = head2;
		}else{
			tail.next = head1;
		}
		return head.next;
	}
	private static class ListNode {
    	int val;
    	ListNode next;
    	
    	ListNode(int x){
    		val = x;
    		next = null;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
