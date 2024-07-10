package com.imzt.one.q1_q50.q14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 1) {
            return strs[0];
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            boolean flag = true;
            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != c) {
                    flag = false;
                }
            }
            if (flag) {
                result.append(c);
            } else {
                break;
            }
        }
        return result.toString();
    }
}