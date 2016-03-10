/**
 * @author sunxiaoyang
 */
public class _297_Serialize_and_Deserialize_Binary_Tree {
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

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return null;

        StringBuilder re = new StringBuilder();
        re.append("[").append(root.val);

        if (root.left == null && root.right == null) {
            re.append("[-][-]");
        } else if (root.left == null) {
            re.append("[-]").append(serialize(root.right));
        } else if (root.right == null) {
            re.append(serialize(root.left)).append("[-]");
        } else {
            re.append(serialize(root.left)).append(serialize(root.right));
        }
        return re.append("]").toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.equals("[-]")) return null;

        data = data.substring(1, data.length() - 1);
        int lf = data.indexOf("["); // left first
        TreeNode root = new TreeNode(Integer.parseInt(data.substring(0, lf)));

        int ls = 0/* left sum */, i = lf;
        while (i < data.length()) {
            ls += data.charAt(i) == '[' ? 1 : data.charAt(i) == ']' ? -1 : 0;
            if (ls == 0) break;
            i++;
        }
        root.left = deserialize(data.substring(lf, i + 1));
        root.right = deserialize(data.substring(i + 1, data.length()));
        return root;
    }

    public static void main(String[] args) {
        _297_Serialize_and_Deserialize_Binary_Tree a = new _297_Serialize_and_Deserialize_Binary_Tree();
        TreeNode root = a.new TreeNode(1);
        TreeNode n2 = a.new TreeNode(2);
        TreeNode n3 = a.new TreeNode(3);
        TreeNode n4 = a.new TreeNode(4);
        TreeNode n5 = a.new TreeNode(5);
        TreeNode n6 = a.new TreeNode(6);
        TreeNode n7 = a.new TreeNode(7);
        root.left = n2;
        root.right = n3;
//        n2.right = n6;
//        n2.left = n7;
        n3.left = n4;
        n3.right = n5;

        System.out.println(a.serialize(root));
        System.out.println(a.serialize(a.deserialize(a.serialize(root))));
    }

}
