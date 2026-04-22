package com.deven;

public class Ass5 
{

	public Ass5() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static void main1 (String[] args)
		{
			String s = "Deven";
			String newS = new StringBuilder(s).reverse().toString();
			System.out.println("Old String-> "+s+"\n New String-> "+newS);
		}
	public static void main2 (String[] args)
		{
				String s = "Civic";
				StringBuilder newS = new StringBuilder(s);
				newS.reverse()
;				if (s.equalsIgnoreCase(newS.toString())) 
				{
    				System.out.println("pali");
				} else 
				{
				    System.out.println("Not pali");
				}
			
		}
	public static void main (String[] args)
		{
		String str = "apple banana cherry";
		String[] fruits = str.split(" "); 
		System.out.println(fruits.length);
		}


	


}
