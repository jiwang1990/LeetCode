
public class IsSameTree {
	boolean same = true;
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if((p == null) && (q == null))
			return true;
		else if((p == null) || (q == null))
			return false;
		else{
			traverse(p, q);
			return same;
		}
	}
	public void traverse(TreeNode p, TreeNode q){
		if(p == null && q == null) {
			return;
		}else if(p == null || q == null){
			same = false;
			return;
		}else{
			if(p.val != q.val){
				same = false;
				return;
			}else{
				traverse(p.left, q.left);
				if(same == false)
					return;
				
				traverse(p.right, q.right);
				if(same == false)
					return;
			}
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
