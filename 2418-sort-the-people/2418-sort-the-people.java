class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String []ans=new String[heights.length];
        
        TreeMap<Integer,String>map=new TreeMap<>(Collections.reverseOrder());
        
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        
       
        
        int k=0;
        
 for(Map.Entry<Integer,String> entry : map.entrySet()) {
  
  String value = entry.getValue();
     
     ans[k++]=value;

  
}
        
        return ans;
        
    }
}