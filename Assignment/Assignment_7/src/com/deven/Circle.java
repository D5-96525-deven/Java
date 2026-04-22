package com.deven;

public class Circle {

    
    private double myX;
    private double myY;
    private double myDiameter;

    
    public Circle() {
        this.myX = 0;
        this.myY = 0;
        this.myDiameter = 100;
    }

   
    public Circle(double x, double y, double diameter) throws NegativeDiameterException {
        this.myX = x;
        this.myY = y;
        setDiameter(diameter); 
    }

    
    public double getX() {
        return myX;
    }

    public double getY() {
        return myY;
    }

    public double getDiameter() {
        return myDiameter;
    }

    
    public void setDiameter(double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative!");
        }
        this.myDiameter = diameter;
    }
}