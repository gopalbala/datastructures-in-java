package com.gb.datastructures.practice.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateSubTrees {
    List<TreeNode> nodeList = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        inorder(root);
        return nodeList;
    }


    String inorder(TreeNode node) {
        if (node == null)
            return "";
        String str = "";
        str += inorder(node.left);
        str += Integer.toString(node.val);
        str += inorder(node.right);

        if (map.get(str) != null && map.get(str) == 1) {
            nodeList.add(node);
        }
        if (map.containsKey(str))
            map.put(str, map.get(str) + 1);
        else
            map.put(str, 1);

        return str;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);

        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);

        FindDuplicateSubTrees findDuplicateSubTrees = new FindDuplicateSubTrees();
        findDuplicateSubTrees.findDuplicateSubtrees(root);
        System.out.println(findDuplicateSubTrees.map);
        System.out.println(findDuplicateSubTrees.nodeList);
    }
}
