class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>subList=new ArrayList<>();
        help(nums,ans,subList,0);
        return ans;
    }

    public void help(int[]nums,List<List<Integer>>ans,
                     List<Integer>subList,int i){

        if(i==nums.length){
            ans.add(new ArrayList(subList));
            return;
        }

        subList.add(nums[i]);
        help(nums,ans,subList,i+1);
        subList.remove(subList.size()-1);
        
        while(i+1<nums.length&&nums[i]==nums[i+1]){
            i++;
        }
        help(nums,ans,subList,i+1);


    }
}