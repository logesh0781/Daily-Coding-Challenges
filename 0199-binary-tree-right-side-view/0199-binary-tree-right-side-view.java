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
        List<Integer> a=new ArrayList<>();
        if(root==null) return a;
        solve(root,a,0);
        return a;
    }
    public void solve(TreeNode root,List<Integer> a,int l){
        if(root==null) return;
        if(a.size()==l) a.add(root.val);
        solve(root.right,a,l+1);
        solve(root.left,a,l+1);
    }
}