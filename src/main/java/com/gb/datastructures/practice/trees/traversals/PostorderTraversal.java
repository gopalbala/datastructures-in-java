package com.gb.datastructures.practice.trees.traversals;

import com.gb.datastructures.practice.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gbalasubramanian on 23/02/19.
 */
public class PostorderTraversal {
    List<Integer> postOrder = new ArrayList<>();

    public void postorder(TreeNode root) {
        if (root == null)
            return;
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.println(root.getVal());
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return postOrder;
        else {
            postorderTraversal(root.getLeft());
            postorderTraversal(root.getRight());
            postOrder.add(root.getVal());
        }
        return postOrder;
    }

    // 3 2 +

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(4));
        root.getRight().setLeft(new TreeNode(3));
        PostorderTraversal postorderTraversal = new PostorderTraversal();
        List<Integer> result = postorderTraversal.postorderTraversal(root);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
        postorderTraversal.postorder(root);
    }
}
