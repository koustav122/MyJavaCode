import java.util.*;
public class FrogJump {
    static int minJumps(int ind, int[] height, int[] dp) {
        if (ind == 0) return 0;
        if (dp[ind] != -1) return dp[ind];
        int left = minJumps(ind - 1, height, dp) + Math.abs(height[ind] - height[ind - 1]);
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = minJumps( ind - 2, height, dp) + Math.abs(height[ind] - height[ind -2]);

}
        return dp[ind] = Math.min(left, right);
    } 
    static int frogJump(int n, int[] height) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return minJumps(n - 1, height, dp);    
    }
    public static void main(String[] args) {
        int[] height = {10, 30, 40, 20};
        int n = height.length;
        System.out.println("Minimum energy required to reach the last stone: " + frogJump(n, height));

}
}

