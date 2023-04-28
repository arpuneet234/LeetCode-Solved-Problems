class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        helper(0,candidates,target,ans,ds);
        return ans;
    }
    
    public void helper(int index, int[]nums, int target, List<List<Integer>> ans, List<Integer>ds){
        if(index==nums.length){
            if(target==0){
                ans.add(new ArrayList(ds));
            }
            return;
        }
        
        helper(index+1,nums,target,ans,ds);
        if(target>=nums[index]){
            ds.add(nums[index]);
            helper(index,nums,target-nums[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        
        
    }
}