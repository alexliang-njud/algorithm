package com.algorithm.sort;

/**
 * 排序算法
 */
public class Bubble {

    public static void sort(int a[]){
        int i,j,temp;

        for(i = 0; i<a.length-1; i++){
            for(j =0; j<a.length-1-i; j++){
                if(a[j]> a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int a[] = {1,8,6,7,4};

        sort(a);

        for(int b:a) {
            System.out.println(b);
        }
    }
}
