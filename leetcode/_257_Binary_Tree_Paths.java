import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _257_Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();

        if (root == null) return result;

        // leaf
        if (root.left == null && root.right == null) {
            result.add(String.valueOf(root.val));
            return result;
        }

        for (String i : binaryTreePaths(root.left)) {
            result.add(root.val + "->" + i);
        }
        for (String i : binaryTreePaths(root.right)) {
            result.add(root.val + "->" + i);
        }
        return result;
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
