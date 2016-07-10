import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sunxiaoyang
 */
public class _107_Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> p = new ArrayList<>();

        if (root != null) p.add(root);

        while (!p.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            List<TreeNode> c = new ArrayList<>();
            for (TreeNode t : p) {
                l.add(t.val);
                if (t.left != null) c.add(t.left);
                if (t.right != null) c.add(t.right);
            }
            p.clear();
            p.addAll(c);
            res.add(l);
        }

        Collections.reverse(res);
        return res;
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
