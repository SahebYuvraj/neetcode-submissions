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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        functionName(0, root, list);
        return list;
        
    }
    public void functionName(int level, TreeNode node, List<List<Integer>> list){
        if(node == null){return;}
        if(list.size() == level){
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);

        functionName(level+1, node.left, list);
        functionName(level+1, node.right, list);
    }
}
