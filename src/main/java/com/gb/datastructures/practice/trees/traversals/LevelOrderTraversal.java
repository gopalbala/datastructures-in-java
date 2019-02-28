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

    /**
     *       1
     *    2    3
     *   4 5  6  7
     *
     * 1 -> queue
     *
     * 1 print []
     *
     * 2 - enqueue to queue [2]
     * 3 - enqueue to queue [2,3]
     *
     * 2 - print [3]
     *
     * enqueue 4 -> [3,4]
     * enqueue 5 -> [3,4,5]
     *
     * print 3
     *
     * enqueue [5] ->  [4,5,6]
     * enqueue [60 -> [4,5,6,7]
     *
     * print 4 5 6 7
     *
     *
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(4));
        root.getRight().setLeft(new TreeNode(3));
       LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        System.out.println( levelOrderTraversal.levelOrder(root));
    }
}
