package com.gb.datastructures.practice.numbertheory;

public class NextSmaller {
    public int solution(int N) {
        // write your code in Java SE 8
        if (N <= 0)

        if (N == 1)
            return 0;
        int digitCnt = digitCount(N);
        //System.out.println(digitCnt);
        int smallestNumber = (int) Math.pow(10, digitCnt - 1);

        int multiplier = N / smallestNumber;
        System.out.println(multiplier);
        return smallestNumber % N == 0 ? N : smallestNumber * multiplier;
    }

    private int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NextSmaller smaller = new NextSmaller();
        int num = smaller.solution(93);
        System.out.println(num);
    }
}
