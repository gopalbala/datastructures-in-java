package com.gb.datastructures.practice.trees.traversals;

import com.gb.datastructures.practice.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gbalasubramanian on 23/02/19.
 */
public class PostorderTraversal {
    List<Integer> postOrder = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return postOrder;
        else{
            postorderTraversal(root.getLeft());
            postorderTraversal(root.getRight());
            postOrder.add(root.getVal());
        }
        return postOrder;
    }

}
