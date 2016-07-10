
/**
 * @author sunxiaoyang
 */
public class _101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l != null && r != null)
            return l.val == r.val && isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
        return l == null && r == null;
    }


    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}