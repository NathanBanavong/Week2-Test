package com.example.consultants.week2_test;

//1. Convert a given string to a linkedList of characters in the String. Do not use LinkedList
//class in Java but create it from scratch. Should also add and remove elements from the list.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CharactersLinkedList {

    Stack stack = new Stack();  //global to allow stack to be accessible for enqueue and dequeue

    public static void main(String[] args) {
//        LinkedList
//        String leWord = "meow";
//        char[] arrChar = leWord.toCharArray();
//        LinkedList newLinkList = new LinkedList(arrChar);

//        Stack
//        Stack stack = new Stack();
//        stack.push("1");
//        stack.push("2");
//        stack.push("3");
//        stack.pop();
//
//        Stack
//        String str1 = "nathan";
//        String str2 = "bob";
//        String str3 = "john";
//
//        enqueue(str1);

        Queue queue = new LinkedList();
        queue.enqueue("tryme 1");
        queue.add("tryme 2");
        queue.add("tryme 3");

//


    }

//    public void enqueue(String string) {
////        Stack stack = new Stack();
//        stack.push(string);
//    }
//
//    public void dequeue() {
////        Stack stack = new Stack();
//        stack.pop();
//    }

}
