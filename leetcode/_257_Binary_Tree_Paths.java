import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _257_Binary_Tree_Paths {
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

    // 2016-03-24
    public List<String> binaryTreePaths_1(TreeNode root) {
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

    // 2017-03-18
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null) return result;
        if (root.left == null && root.right == null) {
            result.add(String.valueOf(root.val));
            return result;
        }

        result.addAll(binaryTreePaths(root.left));
        result.addAll(binaryTreePaths(root.right));
        for (int i = 0; i < result.size(); i++) {
            result.set(i, new String(root.val + "->" + result.get(i)));
        }
        return result;
    }
}
