package com.algorithm.test;

public class ReplaceSpaceTest {
    public static String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        StringBuilder res = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

    public static String replaceSpace2(StringBuffer str) {

        return str.toString().replace(" ","%20");
    }

    public static void main(String[] args) {
        System.out.println(ReplaceSpaceTest.replaceSpace(new StringBuffer("We Are Happy")));
        System.out.println(ReplaceSpaceTest.replaceSpace2(new StringBuffer("We Are Happy")));
    }
}
