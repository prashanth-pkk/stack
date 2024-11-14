package org.pk;

import java.util.Stack;

public class EvaluatePostfixExpression {
    public static void main(String[] args) {
        String str = "23*5+1+";
        Stack<Integer> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (ch){
                    case '+': stack.push(operand1 + operand2); break;
                    case '*': stack.push(operand1 * operand2); break;
                    case '-': stack.push(operand1 - operand2); break;
                    case '/': stack.push(operand1 / operand2); break;
                }
            }
        }
        System.out.println("Result: " + stack.pop());

    }
}
