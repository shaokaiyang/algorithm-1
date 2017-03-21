import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunxiaoyang on 3/19/17.
 */
public class _113_Path_Sum_II {
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

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;
        if (root.left == null && root.right == null && root.val == sum) {
            List<Integer> level = new ArrayList<>();
            level.add(root.val);
            result.add(level);
            return result;
        }

        result.addAll(pathSum(root.left, sum - root.val));
        result.addAll(pathSum(root.right, sum - root.val));
        for (int i = 0; i < result.size(); i++) {
            List<Integer> level = result.get(i);
            level.add(0, root.val);
            result.set(i, level);
        }
        return result;
    }
}
