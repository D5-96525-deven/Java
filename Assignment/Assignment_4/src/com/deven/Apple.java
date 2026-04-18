package com.deven;

public class Apple extends Fruit {
	
	String color,name;
	Double weight;
	boolean isFresh;

	public Apple() {
			}

	public Apple(String color, String name, Double weight, boolean isFresh) {
		super();
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public Double getWeight() {
		return weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String taste() {

		return "sweet and Sour" ;
	}
	
	@Override
	public String toString()
	{
		return "The name is "+this.name+" and color is "+this.color+" while the weight is "+this.weight;
	}

}
