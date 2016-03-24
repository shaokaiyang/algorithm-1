/**
 * Notes:
 * 动态规划
 * f(n) = f(n-1) + f(n-2) 注意保存中间结果，否则递归将耗时耗内存
 *
 * @author sunxiaoyang
 */
public class _70_Climbing_Stairs {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
