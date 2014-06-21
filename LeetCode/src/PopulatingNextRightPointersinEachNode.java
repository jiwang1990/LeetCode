import java.util.LinkedList;
import java.util.Queue;


public class PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        if(root == null)
             return;
         Queue<TreeLinkNode> levelQueue = new LinkedList<TreeLinkNode>();
         levelQueue.add(root);
         for(int n = 1; !levelQueue.isEmpty(); n *= 2) {
             TreeLinkNode previous = null;
             TreeLinkNode current = null;
             for(int j = 1; j <=n; j++) {
                 current = levelQueue.remove();
                 if(previous != null)
                     previous.next = current;
                 if(current.left != null)
                     levelQueue.add(current.left);
                 if(current.right != null)
                 levelQueue.add(current.right);
                 previous = current;
             }
             previous.next = null;
         }
     }
    private class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
}

}
