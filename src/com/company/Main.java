package com.company;


import static com.company.findPairSum.findPairHashMap;
import static com.company.findPairSum.findPairNoob;
import static com.company.findPairSum.findPairSorting;

public class Main {

    public static void main(String[] args) {

        //findPairSum tests

        int arr[] = { 8, 7, 2, 5, 3, 1};
        int sum = 10;
        findPairNoob(arr, sum);
        findPairSorting(arr, sum);
        findPairHashMap(arr, sum);





    }
}
