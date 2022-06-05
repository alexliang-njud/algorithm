package com.algorithm.test;

import java.util.HashMap;
import java.util.Map;

public class MinStringTest {
    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * @param res
     * @return
     */
    public String calMinStringLength(String res){
        if (res ==null || res.length()==0){
            return "";
        }
        char[] chars = res.toCharArray();
        String maxLengthString = "";
        String tmpLengthString = "";
        for(int m = 0;m <chars.length;m++) {
            Map<Character,Integer> tempMap = new HashMap<>();
            if(tmpLengthString.length()> maxLengthString.length()){
                maxLengthString = tmpLengthString;
            }
            tmpLengthString = "";
            for (int i = m; i < chars.length; i++) {
                if (tempMap.containsKey(chars[i])) {
                    break;
                } else {
                    tmpLengthString = tmpLengthString + chars[i];
                    tempMap.put(chars[i], i);
                }
            }
        }
        return maxLengthString;
    }

    public int lengthOfLongestSubstring(String str) {
        if (str == null || str.length() == 0) return 0;

        HashMap<Character, Integer> temp = new HashMap<>();
        char[] chars = str.toCharArray();

        int res = 0, start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (temp.containsKey(chars[i])) {
                start = Math.max(temp.put(chars[i], i) + 1, start);
            }

            temp.put(chars[i], i);
            res = Math.max(res, i - start + 1);

        }
        return res;
    }

    public static void main(String[] args) {
        MinStringTest minStringTest = new MinStringTest();
        System.out.println(minStringTest.calMinStringLength("adddcdfe"));
        //System.out.println(minStringTest.lengthOfLongestSubstring("adddcdfe"));
//        Map hashMap = new HashMap();
//        System.out.println(hashMap.put("1",1));
//        System.out.println(hashMap.put("1",2));
//        System.out.println(hashMap.put("1",3));
    }
}
