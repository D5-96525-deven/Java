package com.deven;

public class TestCircle {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle();
            System.out.println("Default Diameter: " + c1.getDiameter());

            Circle c2 = new Circle(5, 10, 50);
            System.out.println("c2 Diameter: " + c2.getDiameter());

           
            c2.setDiameter(-20);

        } catch (NegativeDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}