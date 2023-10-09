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
    
    public int maxHeight = 0;
    public int sum = 0;
    public int deepestLeavesSum(TreeNode root){
        dfs(root,0);
        return sum;
    }
    
    public void dfs(TreeNode root,int currHeight) {
        if(root == null) return;
        
        if(currHeight == maxHeight){
            sum = sum + root.val;
        }
        if(currHeight > maxHeight){
            sum =0;
            sum = sum + root.val;
            maxHeight = currHeight;
        }
        dfs(root.left,currHeight + 1);
        dfs(root.right, currHeight + 1);
    }
}