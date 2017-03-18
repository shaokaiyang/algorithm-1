import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author sunxiaoyang
 */

public class _102_Binary_Tree_Level_Order_Traversal {
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

    // 2016-05-08
    public List<List<Integer>> levelOrder_1(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> level_result = new ArrayList<>();
            for (TreeNode i : queue) {
                level_result.add(i.val);
            }
            if (!level_result.isEmpty()) result.add(level_result);

            List<TreeNode> tmp = new ArrayList<>(queue);
            queue.clear();

            for (TreeNode i : tmp) {
                if (i.left != null) queue.add(i.left);
                if (i.right != null) queue.add(i.right);
            }
        }
        return result;
    }

    // 2017-03-18
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int len = queue.size();
            while (len-- > 0) {
                TreeNode tmp = queue.poll();
                level.add(tmp.val);
                if (tmp.left != null) queue.add(tmp.left);
                if (tmp.right != null) queue.add(tmp.right);
            }
            if (!level.isEmpty()) result.add(level);
        }
        return result;
    }

}