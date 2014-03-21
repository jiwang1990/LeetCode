/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class MaxDepth {
	int maxdpth = 0;
	
	public int maxDepth(TreeNode root) {
		if(root != null){
			root.val = 1;
			maxdpth = 1;
			traverse(root);
		}
		return maxdpth;
	}
	public void traverse(TreeNode node) {
		if(node.left != null){
			node.left.val = node.val + 1;
			if(maxdpth < node.left.val)
				maxdpth = node.left.val;
			traverse(node.left);
		}
		if(node.right != null) {
			node.right.val = node.val + 1;
			if(maxdpth < node.right.val)
				maxdpth = node.right.val;
			traverse(node.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			val = x;
		}
	}
}
