package com.gb.datastructures.practice.numbertheory;

public class MaxRepeatedSqrts {
    public int solution(int A, int B) {
        // write your code in Java SE 8]
        if(A>B)
            return 0;
        int max = 0;
        for(int i=A;i<=B;i++){
            int currentMax = squareRoot(i, 0);
            if(currentMax > max)
                max = currentMax;
        }
        return max;
    }

    int squareRoot(int n, int count) {
        if(n <= 2){
            return count;
        }
        double root = Math.sqrt(n);
        if(root - Math.floor(root) == 0){
            return squareRoot((int)root, count+1);
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        MaxRepeatedSqrts maxRepeatedSqrts = new MaxRepeatedSqrts();
        int max = maxRepeatedSqrts.solution(6000,7000);
        System.out.println(max);
    }
}
