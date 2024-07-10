package com.imzt.one.q1_q50.q13;

import java.util.HashMap;
import java.util.Map;

class Solution {
    static Map<Character, Integer> SYMBOLS = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int v = SYMBOLS.get(chars[i]);
            if (i < chars.length - 1 && v < SYMBOLS.get(chars[i + 1])) {
                result -= v;
            } else {
                result += v;
            }
        }
        return result;
    }
}