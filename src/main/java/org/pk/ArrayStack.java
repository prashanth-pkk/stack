package org.pk;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private T[] stack;
    private int top;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayStack() {
        stack = (T[]) new Object[INITIAL_CAPACITY];
        top = 0;
    }

    public ArrayStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("The capacity must be greater than 10");
        }
        stack = (T[]) new Object[capacity];
        top = 0;
    }

    // push() method is used to add the elements in the stack by using of Array class
    public void push(T element) {
        if (top == stack.length) {
            resize(stack.length * 2);
        }
        stack[top++] = element;
    }

    // pop() method is used to remove elements from stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = stack[--top];
        stack[top] = null;
        if (top > 0 && top == stack.length / 4) {
            resize(stack.length / 2);
        }
        return element;
    }

    private void resize(int newSize) {
        if (newSize < INITIAL_CAPACITY) {
            newSize = INITIAL_CAPACITY;
        }
        stack = Arrays.copyOf(stack, newSize);
    }

    //peek() method is used to pick the latest element from the stack
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
