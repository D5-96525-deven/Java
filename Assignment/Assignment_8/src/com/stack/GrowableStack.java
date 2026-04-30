package com.stack;

import java.util.Arrays;

public class GrowableStack implements Stack {
    private Employee[] emps;
    private int top;

    public GrowableStack() {
        this.emps = new Employee[STACK_SIZE];
        this.top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == emps.length - 1) {
            // Double the capacity if full
            emps = Arrays.copyOf(emps, emps.length * 2);
            System.out.println("Stack capacity increased to: " + emps.length);
        }
        emps[++top] = emp;
        System.out.println("Employee added to Growable Stack.");
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Error: Stack is empty!");
            return null;
        }
        return emps[top--];
    }
}