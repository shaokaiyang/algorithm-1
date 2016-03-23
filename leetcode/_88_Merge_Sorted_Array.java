/**
 * @author sunxiaoyang
 */
public class _88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = m + n - 1, i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) nums1[r--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        while (i >= 0) nums1[r--] = nums1[i--];
        while (j >= 0) nums1[r--] = nums2[j--];
    }
}
