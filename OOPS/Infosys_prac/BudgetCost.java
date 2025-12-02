public class BudgetCost {
    public static int solve(int[] projectCosts, int[] projectROI, int totalBudget) {
        int n = projectCosts.length;
        int[][] dp = new int[n + 1][totalBudget + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= totalBudget; w++) {
                int currentCost = projectCosts[i - 1];
                int currentROI = projectROI[i - 1];
                if (currentCost <= w) {
                    int fund = currentROI + dp[i - 1][w - currentCost];
                    int reject = dp[i - 1][w];
                    dp[i][w] = Math.max(fund, reject);
                } else {
                    dp[i][w] = dp[i - 1][w];

            }
    }
}
        return dp[n][totalBudget];
    }

    public static void main(String[] args) {
        int[] projectCosts = {10, 20, 30};
        int[] projectROI = {60, 100, 120};
        int totalBudget = 50;
        int maxROI = solve(projectCosts, projectROI, totalBudget);
        System.out.println("Maximum ROI within budget: " + maxROI);
    }
}
