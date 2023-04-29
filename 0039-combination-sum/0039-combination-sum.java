class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        helper(ans,ds,candidates,target,0);
        return ans;
        
        
    }
    
    public void helper(List<List<Integer>>ans, List<Integer>ds,int[] nums,int target,int i){
        if(i==nums.length){
            if(target==0){
                ans.add(new ArrayList(ds));
            }
            return;
        }
        
        helper(ans,ds,nums,target,i+1);
        if(target>=nums[i]){
            ds.add(nums[i]);
            helper(ans,ds,nums,target-nums[i],i);
            ds.remove(ds.size()-1);
        }
        
        
        
    }
}