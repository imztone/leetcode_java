package com.imzt.one.q1_q50.q28;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int nLength = needle.length(), hLength = haystack.length();
        if (nLength > hLength) {
            return -1;
        }

        int left = 0, right = 0;
        while (left < hLength - nLength + 1) {
            // 匹配首字母
            while (left < hLength && haystack.charAt(left) != needle.charAt(right)) {
                left++;
            }
            if (left == hLength) {
                return -1;
            }
            // 比较第二位
            left++;
            right++;
            while (left < hLength && right < nLength && haystack.charAt(left) == needle.charAt(right)) {
                left++;
                right++;
            }
            if (right == nLength) {
                return left - right;
            } else {
                // 将 left 重置到起始位置的后一位
                left -= right - 1;
                right = 0;
            }
        }
        return -1;
    }
}
