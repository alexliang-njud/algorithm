package com.algorithm.test;

import java.util.Arrays;

public class QucikSortCopy {
    public void qucikSort(int[] arr,int low,int high){
        int l=low, h=high;
        int point = arr[low];
        while(l<h){
            while (l<h && arr[h]>point){
                h--;
            }
            if(l<h){
                arr[l]=arr[h];
                l++;
            }
            while (l<h && arr[l]<point){
                l++;
            }
            if(l<h){
                arr[h]=arr[l];
                h--;
            }
        }
        arr[l] = point;
        if (l - 1 > low) {
            qucikSort(arr, low, l - 1);
        }
        if (h + 1 < high) {
            qucikSort(arr,h+1,high);
        }
    }

    public static void main(String[] args) {
        int[] num ={9,8,2,5,4,11,10};
        QucikSortCopy copy =new QucikSortCopy();
        copy.qucikSort(num,0,6);
        System.out.println(Arrays.toString(num));
    }
}
