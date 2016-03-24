/**
 * @author sunxiaoyang
 */
public class _104_Maximum_Depth_of_Binary_Tree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left) + 1;
        int r = maxDepth(root.right) + 1;
        return l > r ? l : r;
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
