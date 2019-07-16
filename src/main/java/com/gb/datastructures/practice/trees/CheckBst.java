package com.gb.datastructures.practice.trees;

public class CheckBst {

    boolean validate(TreeNode root, int previous) {
        if (root == null)
            return true;
        if (previous >= root.val)
            validate(root.left, root.val);
        System.out.println(root.val);
        if (previous <= root.val)
            return validate(root.right, root.val);
        else
            return false;
    }

    public boolean valid(TreeNode root) {
        return validate(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    boolean validate(TreeNode root, double min, double max) {
        if (root == null)
            return true;
        if (root.val <= min || root.val >= max)
            return false;
        return (validate(root.left, min, root.val) &&
                validate(root.right, root.val, max));
    }

    boolean heightBalanced(TreeNode root) {
        if (root == null)
            return true;
        int lheight = height(root.left);
        int rheight = height(root.right);
        if (Math.abs(lheight-rheight)>1)
            return false;
        return heightBalanced(root.left) && heightBalanced(root.right);
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);

        return Math.max(lheight, rheight) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        CheckBst checkBst = new CheckBst();
        boolean result = checkBst.valid(treeNode);

        System.out.println(result);
    }
}
