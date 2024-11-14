package org.pk;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
