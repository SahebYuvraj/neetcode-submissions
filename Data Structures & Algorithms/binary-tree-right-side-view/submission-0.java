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
    public List<Integer> rightSideView(TreeNode root) {
        int level = 1;
        List<Integer> list = new ArrayList<>();

        funtionName(level,root,list);
        return list;
    }

    public void funtionName(int level,TreeNode node,List<Integer> list){
        if(node == null) return;
        if(level > list.size()) list.add(node.val);

        funtionName(level+1,node.right,list);
        funtionName(level+1,node.left,list);



    }
}
