/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return 0;
        q.add(root);
        int result = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size = q.size();
            result = Math.max(result , size);
            List<Integer> ans = new ArrayList<Integer>();
            while(size > 0){
                Node node = q.poll();
                ans.add(node.data);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                size--;
            }
            res.add(ans);
        }
        return result;
    }
}