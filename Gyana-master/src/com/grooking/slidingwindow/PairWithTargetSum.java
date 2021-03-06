package com.grooking.slidingwindow;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] result = PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }

    private static int[] search(int[] arr, int targetSum) {
        int left = 0 , right = arr.length-1;
        while (left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == targetSum){
                return new int[]{left,right};

            }
            if (currentSum < targetSum){
                left ++; //we need a pair with bigger sum
            }else{
                right--; //we need a pair with smaller sum
            }

        }
        return new int[] { -1, -1 };
    }


//    Time Complexity #
//    The time complexity of the above algorithm will be O(N)O(N), where āNā is the total number of elements in the given array.
//
//    Space Complexity #
//    The algorithm runs in constant space O(1)O(1).
}
