/**
 * @author sunxiaoyang
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class _112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }

        if (root.left != null && hasPathSum(root.left, sum - root.val)) {
            return true;
        }

        if (root.right != null && hasPathSum(root.right, sum - root.val)) {
            return true;
        }
        return false;
    }

}
