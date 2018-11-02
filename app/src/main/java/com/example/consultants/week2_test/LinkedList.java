package com.example.consultants.week2_test;

import org.w3c.dom.Node;

public class LinkedList {
    private Node begin = null;
    private Node end;
//    private int counter;

    public class Node {
        public char data;
        public Node next;

        Node(char ch)
        {
            data = ch;
            next = null;
        }
    }

//    takes in a character list
    public LinkedList(char[]charList) {
//        counter = 0;    //set the increment for node pointer

//        TODO does not pass newnode data into begin data
        for (int i = 0; i < charList.length; i++) {
            if (begin == null) {
                Node newNode = new Node(charList[i]);
                begin.data = newNode.data;
                begin.next = end;
            }
            else{
                Node newNode = new Node(charList[i]);
                end.next = newNode.next;
            }
        }
    }

//    add new character to end
    public void addCharacter(char ch){
        Node newNode = new Node(ch);
        newNode.next = end;
        end.next = null;
    }

//    remove character at beginning
    public void deleteCharacter() {

        Node tempNode = begin;  //make a temp to hold beginning value
        begin = tempNode.next;  //pass next value into begin
//        Node newNode = new Node(ch);

    }
}

