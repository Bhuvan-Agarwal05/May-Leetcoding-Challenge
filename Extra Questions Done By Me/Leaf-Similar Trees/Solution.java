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
    ArrayList<Integer> leafSeq1 = new ArrayList<>();
    ArrayList<Integer> leafSeq2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        findLeaf1(root1);
        findLeaf2(root2);
        
        if(leafSeq1.equals(leafSeq2))
            return true;
        else
            return false;
    }
    private void findLeaf1(TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            leafSeq1.add(root.val);
            return;
        }
        else
        {
            if(root.left!=null)
                findLeaf1(root.left);
            if(root.right!=null)
                findLeaf1(root.right);
        }
    }
    
    private void findLeaf2(TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            leafSeq2.add(root.val);
            return;
        }
        else
        {
            if(root.left!=null)
                findLeaf2(root.left);
            if(root.right!=null)
                findLeaf2(root.right);
        }
    }
}