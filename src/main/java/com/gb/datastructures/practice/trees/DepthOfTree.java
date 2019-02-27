package com.gb.datastructures.practice.trees;

/**
 * Created by gbalasubramanian on 27/02/19.
 */
public class DepthOfTree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

}
