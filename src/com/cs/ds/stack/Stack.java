package com.cs.ds.stack;

import java.util.List;

public class Stack {

    private int top;
    private char[] storage;
    private int capacity;

    public Stack(int size) {
        this.top = -1;
        this.storage = new char[size];
        this.capacity = size;
    }

    //push
    //pop
    //peep
    //isfull
    //isEmpty

    void push(char element) {
        if (isFull()) {
            throw new RuntimeException("Bhai full");
        }
        storage[++this.top] = element;
    }

    char pop() {
        if (isEmpty()) {
            throw new RuntimeException("Bhai empty");
        }
        var indexToPop=this.top--;
        var result= storage[indexToPop];
        storage[indexToPop]=' ';
        return result;
    }

    char peep(){
        return storage[this.top];
    }


    boolean isFull() {
        return this.top == this.capacity;
    }

    boolean isEmpty() {
        return this.top == -1;
    }


    public static void main(String[] args) {

        String exp = "[()]{}";
        char[] chars = exp.toCharArray();
        Stack stack = new Stack(chars.length);
        System.out.println(isBalanced(chars, stack));

    }
    public static boolean isBalanced(char[] chars, Stack stack){

        for(int i=0; i < chars.length; i++){

            if(chars[i] == '{' || chars[i] == '(' || chars[i] == '['){
                stack.push(chars[i]);
                continue;
            }

            if(stack.isEmpty()) return false;

            if(chars[i] == ')'){
                if('(' != stack.pop())return false;
            }

            if(chars[i] == '}'){
                if('{' != stack.pop()) return false;
            }

            if(chars[i] == ']'){
                if('[' != stack.pop()) return false;
            }
        }

        return stack.isEmpty();
    }
}

