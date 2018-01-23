package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findPairSum {

    //Method of finding a pair in a given array that loops through each item and tests the sum to see if it matches

    public static void findPairNoob(int arr[], int sum) {
        //get length of array
        int n = arr.length;

        //first loop uses all but the last element, 2nd loop will use all but the first to avoid overlap
        for (int i = 0; i < n - 1; i++) {
            //offset position by +1
            for (int j = i + 1; j < n; j++) {
                //loop through array and test sums
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found at index " + i + " and " + j);
                    return;
                }
            }
        }
        //else no pair exists
        System.out.println("No pairs match");
    }

    public static void findPairSorting(int arr[], int sum) {
        //sort array ascending
        Arrays.sort(arr);

        //set two indices that point to beginning and end of array
        int low = 0;
        int high = arr.length - 1;
        //loop through it till ends meet
        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                System.out.println("Pair found");
                return;
            }
            //if initial indices don't equal sum, use that info to go up or down through array elements to find sum

            if (arr[low] + arr[high] < sum) {
                low++; //since total is less than sum, go to the next lowest element and test again
            } else {
                high--; //since total is more than sum, go the next highest element and test again
            }
        }
        //No pair exists
        System.out.println("No pairs match");
    }

    public static void findPairHashMap(int arr[], int sum) {
        //create an empty hash map
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //loop through each element
        //check if pair arr[i], sum-arr[i] exists
        //if difference is seen before, print the pair
        for (int i : arr) {
            if (map.containsKey(sum - arr[i])) {
                System.out.println("Pair found at index " + map.get(sum - arr[i]) + " and " + i);
                return;
            }
            //store index of current element in the map
            map.put(arr[i], i);
        }

        System.out.println("Pair not found");


    }






}
