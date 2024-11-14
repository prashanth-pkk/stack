package org.pk;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack<T> {
    private LinkedList<T> stack;

    public LinkedStack() {
        stack = new LinkedList<T>();
    }

    public void push(T element) {
        stack.push(element);
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }
    public void printLinkedStack() {
        Iterator<T> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
