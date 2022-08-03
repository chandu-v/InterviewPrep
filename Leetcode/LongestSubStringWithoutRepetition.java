package Leetcode;

import java.util.*;

public class LongestSubStringWithoutRepetition {
    public static void main(String[] args) {
        System.out.println(approachOne("pwwkew"));
    }

    public static int approachOne(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start_index = 0;
        int curr_index = start_index;
        int max = 0;
        char c = 'c';
        boolean flag = false;
        char [] arr = s.toCharArray();
        int str_len;
        while(curr_index < s.length()) {
            c = arr[curr_index];
            str_len = curr_index-1-start_index;
System.out.println(String.format("BEFORE IF: len: %S, max: %S, char: %S, start_index: %S, curr_index: %S, C INDEX: %S",str_len,max,c,start_index,curr_index,map.get(c)));
System.out.println(String.format("SETTING UP MAX IF: len: %S, max: %S, char: %S, start_index: %S, curr_index: %S",str_len,max,c,start_index,curr_index));                start_index = start_index+1;
               
            if(map.containsKey(c)) {
                map.put(c,curr_index);
                start_index++;
                if(start_index == 0) str_len++;
                while(start_index < arr.length && arr[start_index] == c) {
                    start_index++;
                    flag = true;
                }
                if(flag) {
                    flag = false;
                    start_index--;
                }
                System.out.println(String.format("IF: len: %S, max: %S, char: %S, start_index: %S, curr_index: %S",str_len,max,c,start_index,curr_index));
                
            } else if(curr_index == s.length()-1){
                start_index = start_index+1;
                map.put(c,curr_index);
                System.out.println(String.format("ELSE IF: len: %S, max: %S, char: %S, start_index: %S, curr_index: %S",str_len,max,c,start_index,curr_index));
            }else {
                map.put(c,curr_index);
            }
            if(str_len > max) max = str_len;  
            curr_index++;
        }
        return max;
    }

}