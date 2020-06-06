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
     ArrayList<Integer> list;
    public boolean findTarget(TreeNode root, int k) {
        list = new ArrayList<>();
        find(root);
        
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==k)
                    return true;
            }
        }
        return false;
    }
    private void find(TreeNode root)
    {
        if(root==null)
            return;
        else
        {
            find(root.left);
            list.add(root.val);
            find(root.right);
        }
    }
}