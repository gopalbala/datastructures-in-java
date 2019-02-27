package com.gb.datastructures.practice.trees;

/**
 * Created by gbalasubramanian on 27/02/19.
 */
public class DepthOfTree {
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(4));
        root.getRight().setLeft(new TreeNode(3));
        System.out.println(maxDepth(root));
    }
}
