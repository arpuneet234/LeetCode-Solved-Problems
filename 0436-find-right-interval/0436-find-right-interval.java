class Solution {
    public int[] findRightInterval(int[][] interval) {
        int n=interval.length;
        int []start=new int[n];
        int res[]=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(interval[i][0],i);
            start[i]=interval[i][0];
        }
        Arrays.sort(start);
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            int ans=-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(start[mid]>=interval[i][1]){
                    ans=map.get(start[mid]);
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }
                
            }
            res[i]=ans;
        }
        
        return res;
        
    }
}