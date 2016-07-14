/**
 * @author sunxiaoyang
 */
public class _11_Container_With_Most_Water {
    public int maxArea(int[] height) {
        if (height.length < 2) return 0;
        int res = 0, l = 0, r = height.length - 1;
        while (l < r) {
            int temp = Math.min(height[l], height[r]) * (r - l);
            res = res < temp ? temp : res;
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return res;
    }
}
