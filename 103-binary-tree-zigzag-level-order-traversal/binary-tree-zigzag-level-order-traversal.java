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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList<>();
        if(root == null) return zigzag;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reverseStack = new Stack<>();

            for(int i = 0; i<size;i++){
                TreeNode node = q.poll();

                if(flag){
                    reverseStack.push(node.val);
                }
                else{
                    level.add(node.val);
                }
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

            }
            flag = !flag;
            while(!reverseStack.isEmpty()){
                level.add(reverseStack.pop());
            }
            zigzag.add(level);
        }
        return zigzag;
        
    }
}