class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        helper(nums,result,ds,0);
        return result;
    }

    public void helper(int []nums,List<List<Integer>>result,List<Integer>ds, int i){
        if(i==nums.length){
            result.add(new ArrayList(ds));
            System.out.println(result);
            return;
        }
        helper(nums,result,ds,i+1);
        ds.add(nums[i]);

        helper(nums,result,ds,i+1);
        ds.remove(ds.size()-1);
        
    }
}