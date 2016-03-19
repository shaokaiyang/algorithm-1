/**
 * @author sunxiaoyang
 */
public class _27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length - count; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - count - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                count++;
                i--;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        _27_Remove_Element a = new _27_Remove_Element();
        int[] in = {2, 2, 3};
        System.out.println(a.removeElement(in, 2));
        System.out.println(in.toString());
        for (int i : in) {
            System.out.println(i);
        }
    }
}
