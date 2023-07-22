class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long ans=0;
        int count=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                count=0;
                
            }
            else{
                count++;
                ans+=count;
            }
            
        }
        
        return ans;
        
    }
}