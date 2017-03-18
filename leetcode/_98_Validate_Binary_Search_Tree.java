/**
 * Created by sunxiaoyang on 3/18/17.
 */
public class _98_Validate_Binary_Search_Tree {
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

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        boolean flagleft = true;
        boolean flagright = true;
        if (root.left != null) {
            if (root.left.val < root.val) {
                flagleft = isValidBST(root.left) && max(root.left) < root.val;
            } else
                return false;
        }
        if (root.right != null) {
            if (root.right.val > root.val) {
                flagright = isValidBST(root.right) && min(root.right) > root.val;
            } else
                return false;
        }
        return flagleft && flagright;
    }

    public int min(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        return Integer.min(root.val, Integer.min(min(root.left), min(root.right)));
    }

    public int max(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        return Integer.max(root.val, Integer.max(max(root.left), max(root.right)));
    }
}
