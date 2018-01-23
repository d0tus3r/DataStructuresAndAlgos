package com.company;

public class ThreeWayPartition {

    /**
     * Linear Time Partition to sort an array containing 0s, 1s, and 2s. -- Dutch national Flag problem
     */

    public static void threeWayPartition(int a[], int end) {
        int start = 0;
        int mid = 0;
        int pivot = 1;
        int temp;

        while (mid <= end) {
            //current element is 0
            if (a[mid] < pivot) {
                //swap a[start], a[mid]
                temp = a[start];
                a[start] = a[mid];
                a[mid] = temp;

                ++start;
                ++mid;
                //current element is 2
            } else if (a[mid] > pivot) {
                //swap a[mid], a[end]
                temp = a[mid];
                a[mid] = a[end];
                a[end] = temp;

                --end;

                //element is 1
            } else {
                ++mid;
            }
        }
    }
}
