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
    
    boolean isMirror(TreeNode treeL, TreeNode treeR){
     
        
        if(treeL == null && treeR ==null){
            return true;
        }
        
        if(treeL == null || treeR ==null){
            return false;
        }
           if(treeL.val != treeR.val){
            return false;
        }
        
        
        return isMirror(treeL.left , treeR.right) && isMirror(treeL.right,treeR.left);
    }
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        return isMirror(root.left, root.right);
        
    }
}