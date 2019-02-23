package com.gb.datastructures.practice.trees.traversals;

import com.gb.datastructures.practice.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gbalasubramanian on 23/02/19.
 */
public class PreorderTraversal {
    List<Integer> preOrder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return preOrder;
        else {
            preOrder.add(root.getVal());
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
        return preOrder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getRight().setLeft(new TreeNode(4));
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        List<Integer> result = preorderTraversal.preorderTraversal(root);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
