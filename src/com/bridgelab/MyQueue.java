package com.bridgelab;

public class MyQueue {
    MyNode front;
    MyNode rear;

    /**
     * This method is used to  add element to Queue
     *
     * @param element - element to be added.
     */
    public void enqueue(int element) {
        MyNode node = new MyNode();
        if (front == null) {
            front = node;
            rear = node;

        } else {
            rear.next = node;
            rear = node;

        }
    }
    /* This Method is uded to display the element in Queue. */
    public void display() {
        if (front==null)
            System.out.println("Queue is empty");
        else {
            MyNode temp = front;
            System.out.println("Queue list is -");
            while (temp !=null) {
                System.out.println(temp.key);
                temp = temp.next;
            }
        }
    }
}
