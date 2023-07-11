class Solution {
    public int minCostClimbingStairs(int[] cost) 
    {    
        int n = cost.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);

        return minCost(cost, n, dp);
    }
    
    private static int minCost(int[] cost, int index, int []dp) {
        if (index <= 1) {
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        
        int oneStepCost = cost[index - 1] + minCost(cost, index - 1, dp);
        int twoStepCost = cost[index - 2] + minCost(cost, index - 2, dp);
        
        return dp[index]= Math.min(oneStepCost, twoStepCost);
    }
}