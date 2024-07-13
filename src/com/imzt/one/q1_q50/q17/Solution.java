package com.imzt.one.q1_q50.q17;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
class Solution {

    private static final String[] MAP = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private final List<String> result = new ArrayList<>();
    StringBuilder temp = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backTracking(digits, 0);
        return result;
    }

    private void backTracking(String digits, int num) {
        if (num == digits.length()) {
            result.add(temp.toString());
            return;
        }
        String str = MAP[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTracking(digits, num + 1);
            /*
              清除之前的状态

              假设输入是 23：
                我们首先添加 a（对应 2 ），然后递归到 3
                我们添加 d（对应 3 ），得到 ad，这是一个有效组合
                现在我们需要尝试 e 和 f，但在此之前，我们必须删除 d
                如果不删除 d，下一次循环会得到 ade 而不是正确的 ae
             */
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}