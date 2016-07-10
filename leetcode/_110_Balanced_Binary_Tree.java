/**
 * @author sunxiaoyang
 */
public class _110_Balanced_Binary_Tree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(treeHeight(root.left) - treeHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int treeHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
    }

    /**
     * Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
