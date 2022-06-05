package com.algorithm.test;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                arr[l] = arr[h];
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                arr[h] = arr[l];
                h--;
            }
        }

        arr[l] = povit;

        System.out.print("l=" + (l + 1) + ";h=" + (h + 1) + ";povit=" + povit + "\n");
        System.out.println(Arrays.toString(arr));
        if (l - 1 > low) sort(arr, low, l - 1);
        if (h + 1 < high) sort(arr, h + 1, high);
    }

    public static void main(String[] args) {
        int[] num ={9,8,2,5,4,11,10};
        QuickSort.sort(num,0,6);
    }

}
