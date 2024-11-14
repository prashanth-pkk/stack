package org.pk;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Employee> arrayStack = new ArrayStack<>(10);
        arrayStack.push(new Employee(1, "James", 120.5, "sales"));
        arrayStack.push(new Employee(2, "Rock", 150, "operations"));
        arrayStack.push(new Employee(3, "Robert", 110, "security"));
        arrayStack.push(new Employee(4, "Smith", 170, "testing"));

        //print
         arrayStack.printStack();

        //peek
        System.out.println(arrayStack.peek());

        //pop
        System.out.println(arrayStack.pop());


        //LinkedStack
        LinkedStack<Employee> linkedStack = new LinkedStack<>();
        linkedStack.push(new Employee(1, "James", 120.5, "sales"));
        linkedStack.push(new Employee(2, "Rock", 150, "operations"));
        linkedStack.push(new Employee(3, "Robert", 110, "security"));
        linkedStack.push(new Employee(4, "Smith", 170, "testing"));

        //print
        linkedStack.printLinkedStack();

        //peek
        System.out.println(linkedStack.peek());

        //pop
        System.out.println(linkedStack.pop());
    }
}