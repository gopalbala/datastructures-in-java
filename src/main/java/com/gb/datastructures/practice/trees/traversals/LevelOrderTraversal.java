package com.gb.datastructures.practice.trees.traversals;

import com.gb.datastructures.practice.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by gbalasubramanian on 24/02/19.
 */
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            while (size > 0) {
                TreeNode curr = queue.remove();
                level.add(curr.getVal());
                if (curr.getLeft() != null) queue.add(curr.getLeft());
                if (curr.getRight() != null) queue.add(curr.getRight());
                size--;
            }

            levels.add(level);
        }

        return levels;
    }
}
