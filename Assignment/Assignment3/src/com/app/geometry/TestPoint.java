package com.app.geometry;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(3,4);
		
		p1.getDetails();
		
		if (p1.isEqual(4, 3))
			{
				System.out.println("Both Points are in same Position");
			}
		else
			{
				System.out.println("The Distance Between 2 points are "+p1.calculateDistance(4, 3));
			}
		

	}

}
