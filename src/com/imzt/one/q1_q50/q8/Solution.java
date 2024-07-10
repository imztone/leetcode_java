package com.imzt.one.q1_q50.q8;

class Solution {
    public int myAtoi(String s) {
        char[] array = s.trim().toCharArray();
        if (array.length == 0) {
            return 0;
        }
        // 32 位带符号整数,除 10 是为了包含符号
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 1, sign = 1;
        if (array[0] == '-') {
            sign = -1;
        } else if (array[0] != '+') {
            i = 0;
        }
        for (int j = i; j < array.length; j++) {
            // ASCII码 不在数字范围内
            if (array[j] < '0' || array[j] > '9') {
                break;
            }
            if (res > bndry || res == bndry && array[j] > '7') {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (array[j] - '0');
        }
        return sign * res;
    }

    public static void main(String[] args) {
        long num = 2;
        for (int i = 0; i < 30; i++) {
            num = num * 2;
        }
        System.out.println(num - 1);
    }
}