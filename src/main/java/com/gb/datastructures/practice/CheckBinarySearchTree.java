package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 18/02/19.
 */
public class CheckBinarySearchTree {
    public static void main(String args[])
    {
        Tree tree = new Tree();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);

        if (tree.checkBst(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("Given tree is BST");
        else
            System.out.println("Given tree is not BST");
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
    }
}

class Tree {
    TreeNode root;

    public boolean checkBst(TreeNode root, int min, int max) {
        if (root == null)
            return true;
        if (root.data < min || root.data > max)
            return false;
        return checkBst(root.left, min, root.data - 1) && checkBst(root.right, root.data - 1, max);
    }

}