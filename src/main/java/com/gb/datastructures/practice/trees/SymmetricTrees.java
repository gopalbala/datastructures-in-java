package com.gb.datastructures.practice.trees;

/**
 * Created by gbalasubramanian on 27/02/19.
 */
public class SymmetricTrees {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return symmetric(root.left, root.right);
    }

    boolean symmetric(TreeNode n1, TreeNode n2) {
        if(n1==null && n2 == null)
            return true;
        if(n1 != null && n2 != null && n1.val == n2.val)
            return symmetric(n1.left, n2.right) && symmetric(n1.right, n2.left)  ;
        return false;
    }

}
