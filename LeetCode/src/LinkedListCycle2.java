
public class LinkedListCycle2 {
	
    public ListNode detectCycle(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	do {
    		for(int i = 0; i < 2; i++){
    			if(fast != null)
    				fast = fast.next;
    			else
    				return null;
    		}
    		slow = slow.next;
    	} while(fast != slow);
    	
    	ListNode iter = head;
    	while(iter != slow){
    		iter = iter.next;
    		slow = slow.next;
    	}
    	return slow;
    }
     
    private class ListNode {
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
