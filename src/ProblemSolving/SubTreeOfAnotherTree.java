package ProblemSolving;

import javax.swing.tree.TreeNode;

public class SubTreeOfAnotherTree {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    boolean isFlag = false;

        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            traversal(root, subRoot);
            return isFlag;

        }

        public void traversal(TreeNode root, TreeNode subRoot){
            if(root==null)
                return;

            if (root.left.val!=subRoot.val || root.right.val!=subRoot.val){
                return;
            }

            traversal(root.left,subRoot.left);
            traversal(root.right,subRoot.right);

        }

    public void doubleTraversal(TreeNode root, TreeNode subRoot){
        if(root==null || subRoot==null)
            return;

        if(root.left.val!=subRoot.val || root.right.val==subRoot.val){
            isFlag = false;
            return;
        }

            doubleTraversal(root.left, subRoot.left);
            doubleTraversal(root.right, subRoot.right);
    }

    public static void main(String[] args) {

    }
}
