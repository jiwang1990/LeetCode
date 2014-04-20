import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PreOrderTraversal {
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		TreeNode current = root;
		while(current != null && !stack.isEmpty()) {
			while(current != null) {
				stack.addLast(current);
				result.add(current.val);
				current = current.left;
			}
			if(!stack.isEmpty()){
				current = stack.removeLast();
				current = current.right;
			}
		}
		return result;
	}
	
	public ArrayList<Integer> preorderTraversal1(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null)
			return result;
		TreeNode current = root;
		stack.addLast(current);
		while(!stack.isEmpty()) {
			current = stack.removeLast();
			result.add(current.val);
			
			if(current.right != null)
				stack.addLast(current.right);
			if(current.left != null)
				stack.addLast(current.left);
		}
		return result;
	}
}
