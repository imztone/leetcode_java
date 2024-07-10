package com.imzt.one.q1_q50.q5;

/**
 * q:<a href="https://leetcode.cn/problems/longest-palindromic-substring/">link</a>
 */
class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            // 奇数 -> 只有一个中心点
            int left = i - 1, right = i + 1;
            String sub = getString(s, left, right);
            if (sub.length() > result.length()) {
                result = sub;
            }
            // 偶数 -> 有两个中心点
            left = i - 1;
            right = i;
            sub = getString(s, left, right);
            if (sub.length() > result.length()) {
                result = sub;
            }
        }
        return result;
    }

    private String getString(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}