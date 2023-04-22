class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int ans=Integer.MIN_VALUE;
        while(left<right){
            int width=right-left;
            int water=Math.min(height[left],height[right])*width;
            ans=Math.max(ans,water);
            if(height[left]<height[right])left++;
            else right--;
        }
        return ans;
        
    }
}