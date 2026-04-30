package com.deven;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    int id;
    String name;
    Address address;

    Student() {
        this.id = 0;
        this.name = "Default";
        this.address = new Address("Unknown");
    }

    Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        this.address = s.address;
    }

    Student(int id, String name, Student s) {
        this.id = id;
        this.name = name;
        this.address = new Address(s.address.city);
    }

    void display() {
        System.out.println(id + " " + name + " " + address.city);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Address addr = new Address("Pune");

        Student s1 = new Student(1, "Deven", addr);

        Student shallowCopy = new Student(s1);

        Student deepCopy = new Student(2, "Copy", s1);

        s1.address.city = "Mumbai";

        s1.display();
        shallowCopy.display();
        deepCopy.display();
    }
}
