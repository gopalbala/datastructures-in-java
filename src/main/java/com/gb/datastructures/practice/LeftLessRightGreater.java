package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 12/02/19.
 */
public class LeftLessRightGreater {
    public int findPos(int[] arr) {
        int[] leftMax = new int[arr.length];
        int[] rightMin = new int[arr.length];
        printArray(arr);
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i - 1], leftMax[i - 1]);
        }
        rightMin[arr.length-1] = Integer.MAX_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i+1], rightMin[i+1]);
        }
        printArray(leftMax);
        printArray(rightMin);
        for (int i = 1; i <arr.length-1; i++) {

            if (leftMax[i] <= arr[i] && rightMin[i] >= arr[i]) {
                System.out.println(arr[i]);
                return arr[i];
            }
        }

        return -1;

    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static int find(int a[]){
        int k=0, j = 2;
        Integer solution = null;
        for(int i=1;i< a.length-1;){
            if((a[i] > a[k]) && (a[i] < a[j]))
            {
                if(k == i && j== a.length-1){
                    solution = a[i];
                    break;
                }
                if(k < i){
                    k++;
                }
                if(j<=a.length-1){
                    j++;
                }
            }
            else{
                k=0;
                i=i+1;
                j=i+1;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] arr = //{7, 14, 16, 18};
                //{4, 3, 2, 7, 8, 9};
                // {5, 1, 4, 3, 6, 8, 10, 7, 9};
                {4, 2, 5, 7};
        LeftLessRightGreater leftLessRightGreater = new LeftLessRightGreater();
        leftLessRightGreater.findPos(arr);
        //System.out.println(find(arr));

    }
}
