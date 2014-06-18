import java.util.Deque;
import java.util.LinkedList;


public class ReorderList {
	public static void reorderList(ListNode head) {
		if(head == null || head.next == null)
			return ;
		Deque deque = new LinkedList<ListNode>();
		ListNode current = head;
		while(current != null){
			deque.addLast(current);
			current = current.next;
		}

		ListNode result = new ListNode(0);
		while(!deque.isEmpty()){
			result.next = (ListNode) deque.pollFirst();
			result = result.next;
			if(!deque.isEmpty()){
				result.next = (ListNode) deque.pollLast();
				result = result.next;
			}
		}
		result.next = null;
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
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		reorderList(node1);
		
		while(node1 != null){
			System.out.print(node1.val + " ");
			node1 = node1.next;
		}
	}

}
