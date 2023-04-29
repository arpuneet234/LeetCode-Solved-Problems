class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        int [][]jobs=new int[n][2];
        for(int i=0;i<n;i++){
            jobs[i][0]=difficulty[i];
            jobs[i][1]=profit[i];
            
        }
        
        Arrays.sort(jobs,(a,b)->a[0]-b[0]);
        Arrays.sort(worker);
        int maxProfit=0;
        int i=0;
        int bestProfit=0;
        for(int ablity:worker){
            while(i<n&&ablity>=jobs[i][0]){
                bestProfit=Math.max(bestProfit,jobs[i][1]);
                i++;
            }
            maxProfit+=bestProfit;
            
        }
        return maxProfit;
        
    }
}