package com.deven;

public class Shape_hierarchy 
{
	
	static abstract class Shape{}
	
	static abstract class TwoDShape extends Shape
		{
			    abstract double area();
		}
	
	static abstract class ThreeDShape extends Shape
		{
			abstract double volume();
			abstract double area();
		}
	
	static class Circle extends TwoDShape 
		{
			double radius;
			
			Circle(double radius)
				{
					this.radius = radius;
				}
			
			double area()
				{
					return Math.PI * this.radius* this.radius;
				}
		}
	
	static class Rectangle extends TwoDShape 
		{
			double len,bre;

			public Rectangle(double len, double bre) {
				super();
				this.len = len;
				this.bre = bre;
			}
			
			double area()
				{
					return this.len * this.bre;
				}
		}
	
	static class Sphere extends ThreeDShape
		{
			double radius;
	
			public Sphere(double radius) {
				super();
				this.radius = radius;
			}
			
			double volume()
				{
					return (4/3)*Math.PI*Math.pow(radius, 3);
				}
			double area()
				{
					return 4*Math.PI*Math.pow(radius, 2);
				}
		}

	static class Cube extends ThreeDShape
		{
			double edge;

			public Cube(double edge) {
				super();
				this.edge = edge;
			}
			
			double volume()
				{
					return Math.pow(edge, 3);
				}
			double area()
				{
					return 6 * Math.pow(edge, 2);
				}
		}
	
	public static void main(String[] args) 
	{

	    Circle c = new Circle(5.0); 
	    Rectangle r = new Rectangle(4, 6);
	    Sphere s = new Sphere(3);
	    Cube cu = new Cube(2);
	    
	    System.out.println("The Area of Circle "+c.area());
	    
	    System.out.println("The Area of Rectangle "+r.area());
	    
	    System.out.println("**********************************");
	    
	    System.out.println("The Area of Sphere "+s.area());
	    System.out.println("The Valoume of Sphere "+s.volume());
	    
	    System.out.println("The Area of Cube "+cu.area());
	    System.out.println("The Valoume of Sphere "+cu.volume());
	    


	   
	}

}
	
	

