package com.interviews.netapp;

public class ArrayOccurance {
//    A = [2 2 2 2  2 2 2  5 6 9]
//    N = 2
//    OP = 2
//
//    A = [-2 -1 -1 0  2 2 2  5 6 9]
//    N = 4
//    OP = 0


    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2, 2, 2, 5, 6, 9};
        int elemenetFound = 2;
        int length = arr.length;
        //int count = countOfOccuerenceOf(arr, elemenetFound), lenght;
        int z = getMeTheFirstArr(arr, 0, arr.length - 1, elemenetFound, arr.length);
        System.out.println("The mid=" +z);
    }


//    countOfOccuerenceOf(int arr[],int x, int length) {
//        Int i;
//        Int j;
//        getMeTheFirstArr(arr, 0, length - 1, x);
//        if () {
//        }
    //}


    static int getMeTheFirstArr(int arr[], int lowest, int highest, int x, int length) {
        if (highest > lowest) {
            int mid = (lowest + highest) / 2;
            if (mid == 0 || x > arr[mid - 1] || arr[mid] == x) {
               return mid;
            } else if (x > arr[mid]) {
                return getMeTheFirstArr(arr, (mid + 1), highest, x, length);
            } else {
                return getMeTheFirstArr(arr, lowest, mid - 1, x, length);
            }
        }
        return 0;

    }

}
