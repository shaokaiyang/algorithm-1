import java.util.List;
import java.util.ArrayList;

/**
 * @author sunxiaoyang
 */

public class _102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> s = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();

        if (root == null) return l;
        s.add(root);

        while (!s.isEmpty()) {
            List<Integer> li = new ArrayList<>();
            List<TreeNode> q = new ArrayList<>();
            for (TreeNode i : s) {
                li.add(i.val);
                q.add(i);
            }
            s.clear();
            if (!li.isEmpty()) l.add(li);

            for (TreeNode i : q) {
                if (i.left != null) s.add(i.left);
                if (i.right != null) s.add(i.right);
            }
        }
        return l;
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