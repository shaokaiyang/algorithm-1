/**
 * Notes:
 *   1        1
 *  /    =>    \
 * 2            2
 *
 * @author sunxiaoyang
 */
public class _226_Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
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
