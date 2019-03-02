package com.gb.datastructures.practice.trees;

import java.util.Arrays;

/**
 * Created by gbalasubramanian on 28/02/19.
 */
public class TreefromInPostOrderTraversals {
    int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        return build(inorder, postorder, 0, inorder.length - 1);

    }

    private TreeNode build(int[] ino, int[] po, int start, int end) {
        if (start > end)
            return null;
        TreeNode node = new TreeNode(po[index]);
        index--;
        if (start == end)
            return node;
        int idx = 0;
        for (int i = start; i <= end; i++) {
            if (ino[i] == node.val) {
                idx = i;
                break;
            }
        }
        node.right = build(ino, po, idx + 1, end);
        node.left = build(ino, po, start, idx - 1);

        return node;
    }

    public static void main(String[] args) {
        TreefromInPostOrderTraversals treefromInPostOrderTraversals = new TreefromInPostOrderTraversals();
        int[] in = {9, 3, 15, 20, 7};
        int[] po = {9, 15, 7, 20, 3};
        TreeNode node = treefromInPostOrderTraversals.buildTree(in, po);
        System.out.println(node);
        String s = "";

    }

}
