package com.algorithm.test;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        char[] chars ={'a','b','c','d'};
        String str= "abccdabcd";
        System.out.println(Main.getIndex(chars,str));
    }
    public static int getIndex(char[] chars,String str){
        if(str==null || str.length()==0){
            return -1;
        }
        char[] tmpChars = str.toCharArray();
        if(tmpChars.length< chars.length){
            return -1;
        }
        HashMap<Character,Character> charMap = new HashMap<Character,Character>();
        for(int j=0;j<chars.length;j++){
            charMap.put(chars[j],chars[j]);
        }
        int start=0; boolean flag = false;
        for(int i =0;i<tmpChars.length;i++){
            if(charMap.containsKey(tmpChars[i])){
                HashMap tmpMap = new HashMap();
                tmpMap.putAll(charMap);
                tmpMap.remove(tmpChars[i]);
                if(i+chars.length>tmpChars.length){
                    break;
                }
                for(int k =i+1;k<i+chars.length;k++){
                    flag = true;
                    start = i;
                    if(tmpMap.containsKey(tmpChars[k])){
                        tmpMap.remove(tmpChars[k]);
                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
        }
        if(!flag) {
            return -1;
        }
        return start;
    }
}