class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        Boolean isNeg=false;
        
        for(int i=0;i<n;i++){
            if(nums[i]==0)return 0;
            if(nums[i]<0)isNeg=!isNeg;
        }
        
        if(isNeg==true)return -1;
        else return 1;
        
    }
}