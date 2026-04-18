package com.deven;

public abstract class Fruit {
	String color,name;
	Double weight;
	boolean isFresh;
	

	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String color, String name, Double weight, boolean isFresh) {
		super();
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.isFresh = isFresh;
	}

	public abstract String getColor();

	public abstract String getName();

	public abstract Double getWeight();

	public abstract boolean isFresh();

	public abstract void setColor(String color);

	public abstract void setName(String name);

	public abstract void setWeight(Double weight);

	public abstract void setFresh(boolean isFresh);
	
	

	public abstract String taste();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
