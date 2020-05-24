/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return tree(preorder,0,preorder.length-1);
    }
    public TreeNode tree(int[] preorder,int l,int r)
    {
        if(l>r)
            return null;
        TreeNode root = new TreeNode(preorder[l]);
        if(l==r)
            return root;
        
        int index=l+1;
        while(index<=r && preorder[index]<preorder[l])
         index++;
        
        root.left = tree(preorder,l+1,index-1);
        root.right = tree(preorder,index,r);
        
        return root;
    }
}