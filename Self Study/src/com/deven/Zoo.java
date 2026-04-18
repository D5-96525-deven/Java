package com.deven;

public class Zoo {
	
	static abstract class Animal
	{
		abstract void sound();
	}
	
	static class Lion extends Animal
	{
		void sound()
		{
			System.out.println("Lion Roars");
		}
	}
	
	static class Duck extends Animal{
		void sound()
		{
			System.out.println("Baadak Cackle");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
