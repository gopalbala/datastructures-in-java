package com.gb.datastructures.practice.linkedlists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
//        ListNode node = new ListNode(1);
//        node.next = new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        ReverseInPairs reverseInPairs = new ReverseInPairs();
//        ListNode n = reverseInPairs.swapPairs(node);
//        reverseInPairs.printList(n);
//
//        ZonedDateTime zonedDateTime =  ZonedDateTime.now();
//        System.out.println(zonedDateTime);


        System.out.println(minSum(new ArrayList<>(), 4));

        //System.out.println(getIdealNums(200, 405));
    }


    static int minSum(List<Integer> num, int k) {

        num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(7);

//        SortedSet<Integer> sorted = new HashSet<>();

        ArrayList<Integer> sorted = (ArrayList) num;
        Collections.sort(sorted, Comparator.reverseOrder());

//        Collections.sort(sorted, Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            int nm = sorted.get(0);
            if (sorted.size() > 1 && Math.ceil(nm / 2.0) >= sorted.get(1)) {
                sorted.remove(0);
                int nm1 = (int) Math.ceil(nm / 2.0);
                int j = binSearch(sorted, 0, sorted.size() - 1, nm1);
                sorted.add(j, (int) Math.ceil(nm / 2.0));
            } else {
                sorted.remove(0);
                int nm1 = (int) Math.ceil(nm / 2.0);
                int j = binSearch(sorted, 0, sorted.size() - 1, nm1);
                sorted.add(j, (int) Math.ceil(nm / 2.0));
//                sorted.add((int) Math.ceil(nm / 2.0));
            }

        }
        int sum = 0;
        for (int i = 0; i < sorted.size(); i++) {
            sum += sorted.get(i);
        }
        return sum;

    }

    static int binSearch(List<Integer> arr, int low, int high, int elem) {
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == elem) {
                return mid;
            } else if (elem > arr.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return mid;
    }

    public static long getIdealNums(long low, long high) {
//        long p = low     / high;
//        return high * (p * (p + 1)) / 2;
        long count = 0;
        for (long i = low; i <= high; i++) {
            long s3 = sum(i, 3);
            long s5 = sum(i, 5);
            long s15 = sum(i, 15);
            long total = s3 + s5 - s15;
            count += total;
        }
        return count;
    }


    public static long sum(long num1, long num2) {
        return num2 * ((num1 / num2) * ((num1 / num2) + 1) / 2);
    }


}


