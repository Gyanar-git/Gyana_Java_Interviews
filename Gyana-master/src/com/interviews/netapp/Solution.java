package com.interviews.netapp;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {2,4,5,5,5,5,5,6,6};
        int length = arr.length;
        int m = 5;

        determnineMajority(arr, length , m);
    }

    private static void determnineMajority(int[] arr, int length, int m) {


    }

    int bSearch(int arr[] , int low , int high , int m){
        int middle = (low + high) / 2;
        if(middle == 0 || m > arr[middle-1] && arr[middle] ==m){
            return  middle;

        }else if(m > arr[middle]){
            return bSearch(arr , (middle+1) ,high , m);

        }else{
            bSearch(arr, low , (middle -1) , m);
        }

        return -1;

    }

}
