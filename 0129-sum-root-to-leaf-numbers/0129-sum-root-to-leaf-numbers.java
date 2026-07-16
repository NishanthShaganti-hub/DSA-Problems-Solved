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
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        inorder(root, root.val);
        return sum;
    }

    public void inorder(TreeNode root, int total) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            sum += total;
            return;
        }

        if (root.left != null)
            inorder(root.left, total * 10 + root.left.val);

        if (root.right != null)
            inorder(root.right, total * 10 + root.right.val);
    }
}