class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int left=0;
        int right=position[n-1];
        int ans=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValid(position,mid,m)){
                ans=mid;
                left=mid+1;
            }

            else {
                right=mid-1;
            }
        }

        return ans;

        
    }

    public boolean isValid(int []position,int mid, int m){
        
        int prev=position[0];
        int placed=1;
        for(int i=0;i<position.length;i++){
            if(position[i]-prev>=mid){
                prev=position[i];
                placed++;
                if(placed==m)return true;
            }
        }

        if(placed<m)return false;
        return true;

        
    }
}