package com.stack;

public class FixedStack implements Stack {
    private Employee[] emps;
    private int top;

    public FixedStack() {
        this.emps = new Employee[STACK_SIZE];
        this.top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top < STACK_SIZE - 1) {
            emps[++top] = emp;
            System.out.println("Employee added to Fixed Stack.");
        } else {
            System.out.println("Error: Stack is full!");
        }
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
