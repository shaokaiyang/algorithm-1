
/**
 * @author sunxiaoyang
 */
public class _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p) return p;
        if (root == q) return q;

        int l = isInTree(root.left, p, q);
        int r = isInTree(root.right, p, q);
        if (l == 3) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (r == 3) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    /**
     * @param root
     * @param p
     * @param q
     * @return 0: not in; 1: p in; 2: q in; 3: p and q in;
     */
    public int isInTree(TreeNode root, TreeNode p, TreeNode q) {
        int result = 0;
        if (root == null) return 0;
        if (root == p) result = 1;
        if (root == q) result = 2;
        return result + isInTree(root.left, p, q) + isInTree(root.right, p, q);
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
