package com.gb.datastructures.practice.trees;

import java.util.List;

/**
 * Created by gbalasubramanian on 23/02/19.
 */
public class TreeNode {
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    int val;
    TreeNode left;
    TreeNode right;

    //List<TreeNode> children;

    public TreeNode(int x) {
        val = x;
    }
}
