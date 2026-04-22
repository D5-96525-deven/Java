package com.deven;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ExceptionLineTooLong {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		try 
		{
			if(str.length()>80)
			{
				throw new ExceptionLineTooLong();
			}
			else
			{
				System.out.println(str);
			}
		}
		catch (ExceptionLineTooLong e)
		{
			System.out.println(e.getTooBigForyou());
		}
	}

}
