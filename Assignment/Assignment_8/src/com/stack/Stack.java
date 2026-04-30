package com.stack;

public interface Stack {
    int STACK_SIZE = 3; // Constant size for initial capacity

    void push(Employee emp);
    Employee pop();
}
