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
    private int pX=0,pY=0,dX=-1,dY=-1;
        
    public boolean isCousins(TreeNode root, int x, int y) {
        
        int d=0;  // Depth of Root Node is 0
        findParentAndDepth(root,x,y,d);
        return ((dX==dY) && (pX!=pY));
        
    }
    
    public void findParentAndDepth(TreeNode root, int x, int y,int d)
    {
        if(root==null)
            return;
        if(root.left != null)
        {
            if(root.left.val==x)
            {
                dX = d + 1;   // Depth of X
                pX = root.val;  // Parent of X
            }
            if(root.left.val==y)
            {
                dY = d + 1;  // Depth of Y
                pY = root.val;  // Parent of Y
            }
        }
        if(root.right != null)
        {
            if(root.right.val==x)
            {
                dX = d + 1;
                pX = root.val;
            }
            if(root.right.val==y)
            {
                dY = d + 1;
                pY = root.val;
            }
        }
        
        if(dX!=-1 && dY!=-1)  return;
        findParentAndDepth(root.left,x,y,d+1);
        findParentAndDepth(root.right,x,y,d+1);
        
    }
}