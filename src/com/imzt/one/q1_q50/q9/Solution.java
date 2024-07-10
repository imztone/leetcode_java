package com.imzt.one.q1_q50.q9;

class Solution {
    public boolean isPalindrome(int x) {
        boolean result = false;
        String num = String.valueOf(x);
        char[] array = num.toCharArray();
        for (char c : array) {
            // 奇数
            int mid = array.length / 2;
            if (array.length % 2 != 0) {
                result = handle(array, mid - 1, mid + 1);
            } else {
                // 偶数
                result = handle(array, mid - 1, mid);
            }
        }
        return result;
    }

    private boolean handle(char[] array, int left, int right) {
        while (left > 0 || right < array.length) {
            if (array[left] != array[right]) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}