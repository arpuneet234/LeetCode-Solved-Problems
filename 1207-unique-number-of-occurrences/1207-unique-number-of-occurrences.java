class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int smallest=1000;
        int largest=-1000;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        int[] freq=new int[largest-smallest+1];
        
        
        for(int i=0;i<n;i++){
            freq[arr[i]-smallest]++;
            
        }
        
        
        
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0 && set.contains(freq[i]))return false;
           
            if(freq[i]>0)set.add(freq[i]);
            
        }
        
        return true;
     
        
    }
}