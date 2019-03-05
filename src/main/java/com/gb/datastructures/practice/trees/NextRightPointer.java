package com.gb.datastructures.practice.trees;

/**
 * Created by gbalasubramanian on 03/03/19.
 */
public class NextRightPointer {
    public Node connect(Node root) {
        root.next = null;
        connectNode(root);
        return root;
    }

    void connectNode(Node root) {
        if(root == null) {
            return;
        }
        if(root.left!=null){
            root.left.next = root.right;
        }
        if(root.right!=null){
            if(root.next!=null){
                root.right.next = root.next.left;
            }
            else {
                root.right.next = null;
            }
        }
        connectNode(root.left);
        connectNode(root.right);
    }

    public static void main(String[] args) {
//        Node tree
//             = new Node(10);
//        tree.left = new Node(8);
//        tree.right = new Node(2);
//        tree.left.left = new Node(3);

        Node tree
                = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        //tree.left.right = new Node(5);

        //tree.right.left = new Node(6);
        tree.right.right = new Node(7);

        NextRightPointer nextRightPointer = new NextRightPointer();
        nextRightPointer.connect(tree);
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int val) {
        this.val = val;
    }
    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}