package com.app.geometry;
import java.lang.Math;

public class Point2D {
	int x,y;
	
	public Point2D() {
		// TODO Auto-generated constructor stub
	}
	
	public Point2D(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getter and Setter are below 

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	 public String getDetails() {
		 Integer X = x;
		 Integer Y = y;
		 String s = "The X and Y co-od are "+X.toString()+" "+Y.toString();
		 return s;
	 }
	 
	 public boolean isEqual(int x1,int y1) {
		 if (this.x==x1 && this.y==y1)
		 {
			 return true;
		 }
		 return false;
	 }
	 
	 public double calculateDistance(int x2,int y2)
	 {
		 double dist;
		 
		 double x_diff = Math.pow((this.x-x2),2);
		 double y_diff = Math.pow((this.y-y2),2);
		 
		 dist = Math.sqrt((x_diff+y_diff));
		 
		 
		 return dist;
	 }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
