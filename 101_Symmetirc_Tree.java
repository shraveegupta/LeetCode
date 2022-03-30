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
//mirror 
//symmetric tree check
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    private boolean isMirror(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null)
            return true;
        if(n1 == null || n2 == null)
            return false;
    return (n1.val == n2.val) && isMirror(n1.right,n2.left) && isMirror(n1.left,n2.right);
    }
}
/*
  if(root==null) reyurn true;stack.push 
        Stack<TreeNode> stack = new stack<>();
        Stack.push(root.left);
        Stack.push(root.right);
        while(!stack.isEmpty){
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();
            if(n1==null && n2==null)
                continue;
            if(n1==null || n2==null || n1.val!=n2.val)
                return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
    return true;
}
*/
        
        
    
