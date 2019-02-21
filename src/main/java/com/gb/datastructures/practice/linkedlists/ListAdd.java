package com.gb.datastructures.practice.linkedlists;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * (5) + (5) = 0 , 1
 * (1->8) , (0) = 1, 8
 */
public class ListAdd {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    //1,8
    //0
    //1 8
    public static ListAdd.ListNode addTwoNumbers(ListAdd.ListNode l1, ListAdd.ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListAdd.ListNode res = null, head = null;
        int total = 0;
        int carry = 0;
        while (l1 != null && l2 != null) {
            if (res == null) {
                total = (l1.val + l2.val);
                carry = total / 10;
                res = new ListAdd.ListNode(total % 10); //13 % 10 = 3
                head = res;
            } else {
                total = (l1.val + l2.val + carry);
                carry = total / 10;

                res.next = new ListAdd.ListNode(total % 10);
                res = res.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            total = (l1.val + carry);
            carry = total / 10;
            res.next = new ListAdd.ListNode(total % 10);
            res = res.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            total = (l2.val + carry);
            carry = total / 10;
            res.next = new ListAdd.ListNode(total % 10);
            res = res.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            res.next = new ListAdd.ListNode(carry);
        }
        return head;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//
//        ListNode l2 = new ListNode(5);
//        l2.next=new ListNode(6);
//        l2.next.next = new ListNode(4);

        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);
//
        ListNode l2 = new ListNode(5);
//        l2.next=new ListNode(6);
//        l2.next.next = new ListNode(4);
        addTwoNumbers(l1, l2);


    }
}

