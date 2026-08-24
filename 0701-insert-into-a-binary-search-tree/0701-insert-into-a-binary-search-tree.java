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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode n=new TreeNode(val);
        if(root==null) return n;
        TreeNode t=root;
        while(true){
            if(t.val>val){
                if(t.left==null){
                    t.left=n;
                    break;
                }
                t=t.left;
            }
            else{
                if(t.right==null){
                    t.right=n;
                    break;
                }
                t=t.right;
            }
        }
        return root;
    }
}