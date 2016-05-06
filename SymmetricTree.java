/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;

		return isSymmetric(root.left,root.right);
	}

	private boolean isSymmetric(TreeNode t1,TreeNode t2) {
		if(t1==null && t2==null) {
			return true;
		} else if(t1==null || t2==null) {
			return false;
		}
		if(t1.val != t2.val) {
			return false;
		} else {
			return isSymmetric(t1.left,t2.right) && isSymmetric(t1.right,t2.left);
		}
	}
}