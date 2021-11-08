package com.bridgelab;

/**
 *  Method to perform Stack operation
 */

public class MyStack {
    private MyNode top;

    /**
     * This method is used to add element to stack
     *
     * @param element: element to be added.
     */
    public void push(int element) {
        MyNode node = new MyNode();
        node.key = element;
        node.next = top;
        top = node;

    }
    /* this method is used to display the stack list */
    public void display() {
        MyNode tempNode = top;
        if (top == null) {
            System.out.println("Stack empty");

        }
        else {
            System.out.println("Stack list is -");

        }
        while (tempNode != null) {
            System.out.println(tempNode.key);
            tempNode = tempNode.next;
        }
    }
}
