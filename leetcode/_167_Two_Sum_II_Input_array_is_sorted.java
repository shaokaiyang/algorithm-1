/**
 * Created by sunxiaoyang on 3/16/17.
 */
public class _167_Two_Sum_II_Input_array_is_sorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left] + numbers[right];
            if (temp == target)
                break;
            else if (temp < target)
                do left++; while (numbers[left] == numbers[left - 1]);
            else
                do right--; while (numbers[right] == numbers[right + 1]);
        }
        return new int[]{left + 1, right + 1};
    }
}
