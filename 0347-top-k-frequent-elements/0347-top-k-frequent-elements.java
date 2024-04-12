class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int n : nums){
            if(map.containsKey(n)){
                int x=map.get(n);
                map.put(n,x+1);
            }
            else{
                map.put(n,1);
            }
        }
        
        ArrayList<Integer>[]arr= new ArrayList[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }
        
        for(Integer i:map.keySet())
        {
            arr[map.get(i)].add(i);
        }
        
        int []res=new int[k];
        int idx=0;
        
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr[i].size();j++){
                if(idx==k)return res;
                res[idx++]=arr[i].get(j);
            }
        }
        
        return res;
        
        
        
        
    }
}