package com.company;

import java.util.Random;

public class FYShuffle {

    /**
     * Fisher-Yates shuffle:
     * Given an array of integers, in place shuffle it. The algorithm should produce an unbiased permutation.
     * This isn't necessarily unbaised as the random function doesn't offer enough permutations for certain tasks.
     */
    public static void fyShuffle(int a[], int n) {

        //parse array from highest index to lowest
        for (int i = n - 1; i >= 1; i--){
            Random rand = new Random();
            int j = rand.nextInt(i + 1); //random number between 0 and i

            //swap current element with randomly generated index
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
