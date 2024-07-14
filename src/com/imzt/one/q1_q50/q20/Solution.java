package com.imzt.one.q1_q50.q20;

import java.util.Stack;

@SuppressWarnings("unused")
class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            Character peeked;
            if (stack.isEmpty()) {
                peeked = '?';
            } else {
                peeked = stack.peek();
            }
            if (peeked == '{' && c == '}') {
                stack.pop();
            } else if (peeked == '(' && c == ')') {
                stack.pop();
            } else if (peeked == '[' && c == ']') {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }
}