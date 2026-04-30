package com.deven;

import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Q7 {
    static Map<Product, Integer> cart = new HashMap<>();
    static List<Map<Product, Integer>> orderHistory = new ArrayList<>();

    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);

        cart.put(p1, 1);
        cart.put(p2, 2);

        checkout();
    }

    static void checkout() {
        orderHistory.add(new HashMap<>(cart));
        cart.clear();
        System.out.println("Order placed");
    }
}