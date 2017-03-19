/**
 * Created by sunxiaoyang on 3/19/17.
 */
public class _437_Path_Sum_III {
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

    public int pathSum(TreeNode root, int sum) {
        int result = 0;
        result += pathSum_part(root, sum);
        if (root != null) {
            result += pathSum(root.left, sum);
            result += pathSum(root.right, sum);
        }
        return result;
    }

    public int pathSum_part(TreeNode root, int sum) {
        int result = 0;
        if (root == null) return result;
        if (root.val == sum) result++;
        result += pathSum_part(root.left, sum - root.val);
        result += pathSum_part(root.right, sum - root.val);
        return result;
    }
}
