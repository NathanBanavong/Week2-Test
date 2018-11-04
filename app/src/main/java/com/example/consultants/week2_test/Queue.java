package com.example.consultants.week2_test;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue queue = new LinkedList();
        queue.add("tryme 1");
        queue.add("tryme 2");
        queue.add("tryme 3");

    }


        public void enqueue(String string) {
//        Stack stack = new Stack();
        stack.push(string);
    }

    public void dequeue() {
//        Stack stack = new Stack();
        stack.pop();
    }
}
