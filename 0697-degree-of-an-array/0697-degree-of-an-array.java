class Solution {
    public int findShortestSubArray(int[] nums) {
       HashMap<Integer,Integer>nums_count=new HashMap<>();
        int degree=0;
        HashMap<Integer,Integer>first_seen=new HashMap<>();
        int min_Length=0;
        
        for(int i=0;i<nums.length;i++){
            first_seen.putIfAbsent(nums[i],i);
            nums_count.put(nums[i],nums_count.getOrDefault(nums[i],0)+1); 
            if(nums_count.get(nums[i])>degree){
                degree=nums_count.get(nums[i]);
                min_Length=i-first_seen.get(nums[i])+1;
            }
            else if(nums_count.get(nums[i])==degree){
                min_Length=Math.min(min_Length,i-first_seen.get(nums[i])+1);
                
            }
        }
        
        return min_Length;
    }
}