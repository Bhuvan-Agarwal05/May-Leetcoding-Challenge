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
    
    HashMap<Integer,TreeSet<Integer>> map = new HashMap<>();
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null)
            return ans;
        else
        {
            TreeSet<Integer> list = new TreeSet<>();
            list.add(root.val);
            map.put(1,list);
            
            int level = 1;
            find(root.left,level+1);
            find(root.right,level+1);
            
           
           for(int i:map.keySet())
           {
               ans.add(map.get(i).last());
           }
            return ans;
        }
        
    }
    public void find(TreeNode root,int level)
    {
        if(root==null)
            return;
        else if(root.left==null && root.right==null)
        {
            if(map.containsKey(level))
            {
               map.get(level).add(root.val);
                map.put(level,map.get(level));
            }
            else
            {
                TreeSet<Integer> list = new TreeSet<>();
                list.add(root.val);
                map.put(level,list);
            }
        }
        else if(root.left==null && root.right!=null)
        {
            find(root.right,level+1);
            if(map.containsKey(level))
            {
                map.get(level).add(root.val);
                map.put(level,map.get(level));
            }
            else
            {
                TreeSet<Integer> list = new TreeSet<>();
                list.add(root.val);
                map.put(level,list);
            }
        }
        else if(root.left!=null && root.right==null)
        {
            find(root.left,level+1);
            if(map.containsKey(level))
            {
                map.get(level).add(root.val);
                map.put(level,map.get(level));
            }
            else
            {
                TreeSet<Integer> list = new TreeSet<>();
                list.add(root.val);
                map.put(level,list);
            }
        }
        else 
        {
           find(root.left,level+1);
           find(root.right,level+1);
            if(map.containsKey(level))
            {
                map.get(level).add(root.val);
                map.put(level,map.get(level));
            }
            else
            {
                TreeSet<Integer> list = new TreeSet<>();
                list.add(root.val);
                map.put(level,list);
            }
        }
        return;
    }
    
}