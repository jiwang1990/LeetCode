import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */
public class PostOrderTraversal {
	/**
	 * An implementation of Non-recursive Post Order Traversal
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		TreeNode current = root;
		TreeNode previous = null;
		
		while(current != null || stack.size() != 0) {
			while(current != null) {
				stack.addLast(current);
				current = current.left;
			}
			if(stack.size() != 0){
				current = stack.getLast();
				if(current.right == null || previous == current.right) {
					stack.removeLast();
					result.add(current.val);
					previous = current;
					current = null;
				}else{
					current = current.right;
				}
			}
		}
		return result;
	}
	

	public ArrayList<Integer> postorderTraversal1(TreeNode root) {
		Deque<TreeNode> stack1 = new LinkedList<TreeNode>();
		Deque<TreeNode> stack2 = new LinkedList<TreeNode>();
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		TreeNode current;
		stack1.addLast(root);
		while(!stack1.isEmpty()) {
			current = stack1.removeLast();
			stack2.addLast(current);
			if(current.left != null)
				stack1.addLast(current.left);
			if(current.right != null)
				stack1.addLast(current.right);
		}
		
		while(!stack2.isEmpty()){
			result.add(stack2.removeLast().val);
		}
		return result;
	}
	
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}