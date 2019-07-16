package com.gb.datastructures.practice;

public class CountFrequency {
    void printfrequency(int arr[], int n)
    {
        // Subtract 1 from every element so that the elements
        // become in range from 0 to n-1
        for (int j = 0; j < n; j++)
            arr[j] = arr[j] - 1;

        // Use every element arr[i] as index and add 'n' to
        // element present at arr[i]%n to keep track of count of
        // occurrences of arr[i]
        for (int i = 0; i < n; i++)
            arr[arr[i] % n] = arr[arr[i] % n] + n;

        // To print counts, simply print the number of times n
        // was added at index corresponding to every element
        for (int i = 0; i < n; i++)
            System.out.println(i + 1 + "->" + arr[i] / n);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        CountFrequency count = new CountFrequency();
        int arr[] = {2, 3, 3, 2, 5};
        int n = arr.length;
        count.printfrequency(arr, n);

        System.out.println(count.getClass().getSimpleName());
    }


}
