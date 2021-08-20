package com.grooking.slidingwindow;

import java.util.HashMap;

public class PairWithTargetSum1 {
    public static int[] search(int[] arr, int targetSum) {
        HashMap<Integer, Integer> nums = new HashMap<>(); // to store numbers and their indices
        for (int i = 0; i < arr.length; i++) {
            if (nums.containsKey(targetSum - arr[i]))
                return new int[] { nums.get(targetSum - arr[i]), i };
            else
                nums.put(arr[i], i); // put the number and its index in the map
        }
        return new int[] { -1, -1 }; // pair not found
    }

    public static void main(String[] args) {
        int[] result = PairWithTargetSum1.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = PairWithTargetSum1.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }

    /*
    Time Complexity #
        The time complexity of the above algorithm will be O(N)O(N), where ‘N’ is the total number of elements in the given array.

    Space Complexity #
        The space complexity will also be O(N)O(N), as, in the worst case, we will be pushing ‘N’ numbers in the HashTable.
     */
}
