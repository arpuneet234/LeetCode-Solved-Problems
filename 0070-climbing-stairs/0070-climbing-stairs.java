class Solution {
    public int climbStairs(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(0,n,dp);
    }
    
    public int helper(int i, int n, int []dp){
        if(i==n)return 1;
        if(i>n)return 0;
        if(dp[i]!=-1)return dp[i];
        
        int option1=helper(i+1,n,dp);
        int option2=helper(i+2,n,dp);
        return dp[i]=option1+option2;
    }
}