/**
 * Notes:
 * ([1,2],0)
 *
 * @author sunxiaoyang
 */
public class _189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        int len = nums.length - 1;
        k %= len + 1;

        int[] temp = nums.clone();
        for (int i = len - k + 1; i <= len; i++) {
            nums[i - len + k - 1] = temp[i];
        }
        for (int i = 0; i <= len - k; i++) {
            nums[i + k] = temp[i];
        }
    }

    public static void main(String[] args) {
        _189_Rotate_Array a = new _189_Rotate_Array();
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 7};
        a.rotate(in, 3);
        for (int i : in) {
            System.out.print(i + " ");
        }
    }
}
