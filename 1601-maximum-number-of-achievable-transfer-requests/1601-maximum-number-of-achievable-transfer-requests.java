class Solution {
    int ans=0;
    public int maximumRequests(int n, int[][] requests) {
        int[]temp=new int[n];
        helper(0, requests,0,temp);
        return ans;  
    }

    public void helper(int i, int[][]requests, int l, int[]temp){
        if(i==requests.length){
            for(int a:temp)if(a!=0)return;
            ans = Math.max(ans,l);
            return ;
        }

        helper(i+1,requests,l,temp);
        temp[requests[i][0]]--;
        temp[requests[i][1]]++;
        helper(i+1, requests, l+1, temp);
        temp[requests[i][0]]++;
        temp[requests[i][1]]--;
    }
}