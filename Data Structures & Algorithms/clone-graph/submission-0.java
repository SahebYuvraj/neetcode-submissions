/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> oldtoNew = new HashMap<>();

        return dfs(node,oldtoNew);
        // thinking dfs with a visted list 
        
    }

    private Node dfs(Node node, Map<Node,Node> oldtoNew){
        if(node == null){return null;}

        if(oldtoNew.containsKey(node)){
            return oldtoNew.get(node);
        }

        Node copy = new Node(node.val);
        oldtoNew.put(node, copy);
        for(Node i: node.neighbors){
            copy.neighbors.add(dfs(i,oldtoNew));
        }
        return copy;
    }
    
}