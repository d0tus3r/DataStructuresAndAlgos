package com.company;


import static com.company.FYShuffle.fyShuffle;
import static com.company.ThreeWayPartition.threeWayPartition;
import static com.company.findPairSum.findPairHashMap;
import static com.company.findPairSum.findPairNoob;
import static com.company.findPairSum.findPairSorting;

public class Main {

    public static void main(String[] args) {

        /**
         * find pair that equals set sum
         */
        int arr[] = { 8, 7, 2, 5, 3, 1};
        int sum = 10;
        findPairNoob(arr, sum);
        findPairSorting(arr, sum);
        findPairHashMap(arr, sum);

        /**
         * three way Partitioning
         */
        int[] threeWayPartitionArr = { 0, 2, 1, 1, 2, 0, 1, 2, 0, 1, 0};
        int n = threeWayPartitionArr.length;
        threeWayPartition(threeWayPartitionArr, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(threeWayPartitionArr[i] + " ");
        }
        System.out.println(" ");
        /**
         * Fisher - Yates shuffle
         */
        int[] b = { 1, 2, 3, 4, 5, 6, 7};
        n = b.length;
        fyShuffle(b, n);
        for (int i = 0; i < n; i++){
            System.out.print(b[i] + " ");
        }




    }
}
