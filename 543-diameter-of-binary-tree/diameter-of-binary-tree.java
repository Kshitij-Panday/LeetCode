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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int ans1 = depth(root.left) +  depth(root.right);
        int ans2 = diameterOfBinaryTree(root.left);
        int ans3 = diameterOfBinaryTree(root.right);
        return Math.max(ans1,Math.max(ans2,ans3));

    }
    public int depth(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}