class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans,ds,candidates,target,0);
        return ans;
        
    }
    
    public void helper( List<List<Integer>>ans,List<Integer>ds,
                       int []nums,int target, int index){
        
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1])continue;
            if(nums[i]>target)break;
            ds.add(nums[i]);
            helper(ans,ds,nums,target-nums[i],i+1);
            ds.remove(ds.size()-1);
        }
    }
}