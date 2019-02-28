package com.gb.datastructures.practice.trees.traversals;

import com.gb.datastructures.practice.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gbalasubramanian on 23/02/19.
 */
public class InOrderTraversal {
    List<Integer> inOrder = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return inOrder;
        else{
            inorderTraversal(root.getLeft());
            inOrder.add(root.getVal());
            inorderTraversal(root.getRight());
        }
        return inOrder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(4));
        root.getRight().setLeft(new TreeNode(3));
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Integer> result = inOrderTraversal.inorderTraversal(root);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    //left , root, right
    // sorted order

    // inorder check if the previous element is less than the current element
}
