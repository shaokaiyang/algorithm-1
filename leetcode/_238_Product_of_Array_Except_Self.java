/**
 * Created by sunxiaoyang on 3/16/17.
 */
public class _238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        int left[] = new int[nums.length + 1];
        int right[] = new int[nums.length + 1];
        for (int i = 0; i < left.length; i++) {
            left[i] = 1;
            right[i] = 1;
        }

        left[0] = 1;
        right[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            left[i + 1] = left[i] * nums[i];
            right[i + 1] = right[i] * nums[nums.length - 1 - i];
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = left[i] * right[nums.length - i -1];
        }

        return output;
    }

    public static void main(String[] args) {
        _238_Product_of_Array_Except_Self a = new _238_Product_of_Array_Except_Self();
        int in[] = {1, 2, 3, 4};
        for (int i : a.productExceptSelf(in)) {
            System.out.print(i + " ");
        }
    }
}
