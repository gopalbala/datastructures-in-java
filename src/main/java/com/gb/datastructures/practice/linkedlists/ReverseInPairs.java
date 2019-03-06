package com.gb.datastructures.practice.linkedlists;

public class ReverseInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode pre = preHead;
        ListNode current, next;
        current = head;
        next = head.next;
        while (current != null && next != null) {
            current.next = next.next;
            pre.next = next;
            next.next = current;
            pre = current;
            current = current.next;
            next = current != null ? current.next : null;
        }
        return preHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    void printList(ListNode head) {
        while (head != null) {
            System.out.print(head + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ReverseInPairs reverseInPairs = new ReverseInPairs();
        ListNode n = reverseInPairs.swapPairs(node);
        reverseInPairs.printList(n);
    }
}
