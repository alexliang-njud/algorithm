package com.algorithm.node;

public class Demo {

    static class DemoTest{
        public void print(){
            System.out.println("这是一个单例类");
        }
    }

    public static int getSameValue(int a[], int sum){
        int i=0,j=1,result=0;

        for(;i<a.length;i++){
            j = i+1;
            int tempSum = a[i];

            if(a[i] == sum){
                result++;
            }else {
                for (; j < a.length; j++) {
                    tempSum = tempSum + a[j];
                    if (tempSum == sum) {
                        result++;
                        break;
                    }
                }
            }
        }

        return result;
    }

    /**
     * 给定一个整数数组和一个整数 k ，请找到该数组中和为 k 的连续子数组的个数。（考虑一下会出现负数场景呢？）
     *
     * 示例 1 :
     * 输入:nums = [1,1,1], k = 2
     * 输出: 2
     * 解释: 此题 [1,1] 与 [1,1] 为两种不同的情况
     * 示例 2 :
     *
     * 输入:nums = [1,2,3], k = 3
     * 输出: 2
     *
     * 输入:nums = [1,2,3,0,-1], k = 2
     * 输出: 2
     * @param args
     */
    public static void main(String[] args) {
        int nums[]={1,2,3,0,-1};
        System.out.println(getSameValue(nums, 0));
    }
}


