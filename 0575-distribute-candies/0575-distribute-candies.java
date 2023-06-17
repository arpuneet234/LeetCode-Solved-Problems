class Solution {
    public int distributeCandies(int[] candyType) {
       
        int n=candyType.length;
         int halfLength=n/2;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(candyType[i])){
                
                
                
                set.add(candyType[i]);
                
                if(set.size()>=halfLength)return halfLength;
            }
                
            
        }
        
        return Math.min(set.size(),halfLength);
        
        
    }
}