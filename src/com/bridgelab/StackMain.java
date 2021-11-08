package com.bridgelab;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack And Queues");
        MyStack stack = new MyStack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        // To perform peak and pop till list is empty
        stack.peak();
        stack.pop();
        stack.display();
        stack.peak();
        stack.pop();
        stack.display();
        stack.peak();
        stack.pop();
        stack.display();

    }
}
