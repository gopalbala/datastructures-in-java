package com.gb.datastructures.practice.com.gb.datastructures.practice.stacks;

import java.util.Stack;

/**
 * Created by gbalasubramanian on 21/02/19.
 */
public class ReverseAStack {
    static Stack<Integer> stack = new Stack<>();

    static void reverse() {
        if (stack.size() == 0)
            return;
        int i = stack.peek();
        stack.pop();
        reverse();
        add(i);
    }

    static void add(int n) {
        if (stack.isEmpty())
            stack.push(n);
        else {
            int i = stack.peek();
            stack.pop();
            add(n);
            stack.push(i);
        }

    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        reverse();
        System.out.println(stack);

    }
}
