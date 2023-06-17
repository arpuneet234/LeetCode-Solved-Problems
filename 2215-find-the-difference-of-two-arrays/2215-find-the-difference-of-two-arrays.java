class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        List<List<Integer>>result=new ArrayList<>();
         for(int ele: nums1){
             set1.add(ele);
         }
        
        for(int ele:nums2){
            set2.add(ele);
        }
        List<Integer>list1=new ArrayList<>();
        for(int ele:set1){
            if(!set2.contains(ele)){
                list1.add(ele);
                
            }
        }
        
        result.add(list1);
        
        List<Integer>list2=new ArrayList<>();
        
        for(int ele:set2){
            if(!set1.contains(ele)){
                list2.add(ele);
            }
        }
        
        result.add(list2);
        
        return result;
        
    }
}