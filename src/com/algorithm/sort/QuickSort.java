package com.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int low, int high) {
       int l = low;
       int h = high;
       int x = arr[low];
       while (l<h){

           while(l<h && x<=arr[h]){
               h--;
           }
           //此时找到一个比基准小的高位数据
           if(l<h){
               arr[l] = arr[h];
               l++;
           }

           while(l<h && arr[l]<=x){
               l++;
           }
           //此时找到一个比基准更大的低位数据
           if(l<h){
               arr[h] = arr[l];
               h--;
           }
       }

       arr[l] = x;

        System.out.print("l=" + (l + 1) + ";h=" + (h + 1) + ";povit=" + x + "\n");
        System.out.println(Arrays.toString(arr));
        //分割低位数据
       if(l-1>low){
           sort(arr, low, l-1);
       }
       //分割高位数据
       if(h+1<high){
            sort(arr, h+1, high);
       }
    }

    public static void main(String[] args) {
        int a[] = {1,8,6,7,4};

        sort(a,0, a.length-1);
    }
}
