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
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(1,root,list);
        return list;
    }

    public void dfs(int level,TreeNode node,List<Integer> list){
        if(node == null) return;
        if(level > list.size()) list.add(node.val);

        dfs(level+1,node.right,list);
        dfs(level+1,node.left,list);



    }
}
