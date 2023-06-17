class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        HashSet<Integer>set3=new HashSet<>();
        HashSet<Integer>res=new HashSet<>();
        List<Integer>result=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
         
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
         
        for(int i=0;i<nums3.length;i++){
            set3.add(nums3[i]);
        }
        
        for(int ele:set1){
            if(set2.contains(ele)||set3.contains(ele)){
                res.add(ele);
                
            }
        }
        
        for(int ele:set2){
            if(set3.contains(ele))res.add(ele);
        }
        
        for(int ele:res){
            result.add(ele);
        }
        
        return result;
        
        
    }
}