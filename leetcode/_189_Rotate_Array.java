/**
 * Notes:
 * ([1,2],0)
 *
 * @author sunxiaoyang
 */
public class _189_Rotate_Array {
    // 2016-03-05
    public void rotate_1(int[] nums, int k) {
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

    // 2017-03-16
    // 利用下标变化。0 移至 (0+k), (0+k) 移至 (0+k+k),..., ((i+k)%len) 移至 ((i+k)%len+k)%len ...
    public void rotate(int[] nums, int k) {
        int foot = 0;
        int swap = nums[foot];
        int len = nums.length;
        boolean flag[] = new boolean[nums.length]; // 'false': nums[i] is not visited, 'true': visited
        while (len-- > 0) {
            foot = (foot + k) % nums.length;
            if (flag[foot]) { // jump to another group
                foot++;
                swap = nums[foot];
                len++;
                continue;
            }
            flag[foot] = true;
            int temp = nums[foot];
            nums[foot] = swap;
            swap = temp;
        }
    }

    public static void main(String[] args) {
        _189_Rotate_Array a = new _189_Rotate_Array();
        int[] in = new int[]{1, 2, 3, 4, 5, 6};
//        int[] in = new int[]{1, 2};
        a.rotate(in, 4);
        for (int i : in) {
            System.out.print(i + " ");
        }
    }
}
