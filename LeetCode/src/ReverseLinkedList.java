
/**
 * 
 * @author ChenBin
 *
 */
public class ReverseLinkedList {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(m == n)
			return head;
		
		ListNode previousNode = new ListNode(-1);
		ListNode previousHeadNode = new ListNode(-1);
		
		ListNode currentNode, nextNode, lastNode;
		previousHeadNode.next = previousNode.next = head;
		lastNode = head;
		for(int i = 0; i < m-1 ; i++) {
			previousNode = lastNode;
			lastNode = lastNode.next;
		}
		currentNode = lastNode;
		nextNode = lastNode.next;
		for(int i = 0; i < n-m; i++) {
			currentNode = nextNode;
			nextNode = nextNode.next;
			currentNode.next = previousNode.next;
			previousNode.next = currentNode;
			
		}
		lastNode.next = nextNode;
		
		if(m == 1) 
			return previousNode.next;
		else
			return previousHeadNode.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
