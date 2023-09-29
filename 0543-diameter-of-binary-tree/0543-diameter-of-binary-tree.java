/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        int[] ans=new int[1];
        
        helper(ans,root);
        
        return ans[0];
        
    }
    
    public int helper(int []ans, TreeNode root){
        if(root==null)return 0;
        
        
        int lh=helper(ans,root.left);
        int rh=helper(ans, root.right);
        
        ans[0]=Math.max(ans[0],rh+lh);
        
        return 1+Math.max(lh,rh);
    }
}