class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        HashSet<Integer>prefixSet=new HashSet<>();
        HashSet<Integer>suffixSet=new HashSet<>();
        int[]prefixArr=new int[n];
        int[]suffixArr=new int[n];
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            prefixSet.add(nums[i]);
            prefixArr[i]=prefixSet.size();
        }
        
        suffixSet.add(nums[n-1]);
        
        for(int i=n-2;i>=0;i--){
            suffixArr[i]=suffixSet.size();
            suffixSet.add(nums[i]);
        }
        
        for(int i=0;i<n;i++){
            ans[i]=prefixArr[i]-suffixArr[i];
        }
        
        return ans;
        
    }
}