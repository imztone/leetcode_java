package com.imzt.one.q1_q50.q12;

class Solution {
    static int[] val = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] str = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < val.length && num > 0; i++) {
            int nVal = val[i];
            String cVal = str[i];
            while (num >= nVal) {
                sb.append(cVal);
                num -= nVal;
            }
        }
        return sb.toString();
    }
}