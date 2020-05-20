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
    ArrayList list;
    public int kthSmallest(TreeNode root, int k) {
         list = new ArrayList();
         inorder(root);
        return (Integer)list.get(k-1);
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
