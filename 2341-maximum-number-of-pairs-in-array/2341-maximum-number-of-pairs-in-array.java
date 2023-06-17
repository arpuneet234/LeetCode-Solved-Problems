class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n=nums.length;
        int[]ans=new int[2];
        int []freq=new int[101];
        
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int pairs=0;
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                pairs+=freq[i]/2;
                
            } 
        }
        
        int rem=n-(pairs*2);
        ans[0]=pairs;
        ans[1]=rem;
        
        return ans;
    
        
    }
}