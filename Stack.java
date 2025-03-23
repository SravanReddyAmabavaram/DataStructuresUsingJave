package com.anr.ds.stack;
import java.util.Scanner;

public class Stack {

    int[] stackStorage;

    int top;
    int capacity;

    Stack (int capacity) {
        stackStorage = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }

    // isStackFull()

    boolean isStackFull() {
        if (top == capacity - 1) {
            return true;
        } else {
            return false;
        }
    }

    // isStackEmpty()

    boolean isStackEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // push()
    boolean push(int item) {
        if (isStackFull()) {
            System.out.println("Stack is overflow");
            return false;
        }

        top = top + 1;
        stackStorage[top] = item;
        return true;
    }

    // pop()

    int pop() {
        if (isStackEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }

        int item = stackStorage[top];
        top = top - 1;
        return item;
    }

    // peek()

    int peek() {
        if (isStackEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }

        int item = stackStorage[top];
        return item;
    }

    void print() {
        System.out.println("Capacity = " + capacity);
        System.out.println("Top      = " + top);
        System.out.println("Stack items are here:");
        for (int i = top; i > -1; i--) {
            System.out.println(stackStorage[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        int item;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        while(true) {
            if (choice == 6) {
                System.out.println("Exited");
                break;
            }

            switch (choice) {
                case 1:
                    // push
                    System.out.println("Enter item to be pushed");
                    item = scanner.nextInt();
                    stack.push(item);
                    stack.print();
                    break;

                case 2:
                    // Pop
                    item = stack.pop();
                    System.out.println("Got item from stack = " + item);
                    stack.print();
                    break;

                case 3:
                    // peek
                    item = stack.peek();
                    System.out.println("Got item from stack = " + item);
                    stack.print();
                    break;

                case 4:
                    // Overflow
                    boolean overflow = stack.isStackFull();
                    if (overflow) {
                        System.out.println("Stack is overflow");
                    } else {
                        System.out.println("Stack is not overflow");
                    }
                    stack.print();
                    break;

                case 5:
                    // Overflow
                    boolean underflow = stack.isStackEmpty();
                    if (underflow) {
                        System.out.println("Stack is underflow");
                    } else {
                        System.out.println("Stack is not underflow");
                    }
                    stack.print();
                    break;
            }
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
        }
    }

}