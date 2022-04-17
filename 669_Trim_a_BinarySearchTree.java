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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        //base condition
        if(root == null){
            return null;
        }
        if(root.val >= low && root.val <= high){
            root.left = trimBST(root.left,low,high); //update the left node val
            root.right = trimBST(root.right,low,high); //update the right node val
        }
        else if(root.val < low){
            return trimBST(root.right,low,high); // make recursive call over right nodes
        }
        else if(root.val > high){
            return trimBST(root.left,low,high); //make recursive calls over left node
        }
        return root;
    }
}
