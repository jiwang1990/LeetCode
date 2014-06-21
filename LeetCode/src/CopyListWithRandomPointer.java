import java.util.HashMap;

/**
 * Use HashMap
 * @author binge
 *
 */
public class CopyListWithRandomPointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null)
			return null;
		HashMap<RandomListNode, RandomListNode> nodeMap = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode original = head;
		RandomListNode copiedList = new RandomListNode(original.label);
		RandomListNode current = copiedList;
		nodeMap.put(original, current);
		original = original.next;
		while(original != null){
			current.next = new RandomListNode(original.label);
			current = current.next;
			nodeMap.put(original, current);
			original = original.next;
		}
		original = head;
		current = copiedList;
		while(original != null){
			current.random = nodeMap.get(original.random);
			
			original = original.next;
			current = current.next;
		}
		return copiedList;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) {
			this.label = x;
		}
	}

}
