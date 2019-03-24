package com.gb.datastructures.practice.trees;

public class SortedArray2Bst {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        if(nums.length == 1)
            return new TreeNode(nums[0]);
        return sArray2Bst(nums, 0, nums.length -1);
    }

    TreeNode sArray2Bst(int[] nums, int start, int end) {
        if(start > end)
            return null;
        int mid = (start + end) /2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sArray2Bst(nums, start, mid -1);
        node.right = sArray2Bst(nums, mid+1, end);

        return node;
    }

    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        SortedArray2Bst sortedArray2Bst = new SortedArray2Bst();
        System.out.println(sortedArray2Bst.sortedArrayToBST(arr));
    }
}
