package com.app.geometry;
import java.util.*;

public class CreditLimit {
	
	int acc_num,beg_bal,charges,credits,limit,new_bal;

	public CreditLimit() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number:");
		this.acc_num = sc.nextInt();
		
		System.out.println("Enter balance at the beginning of the month:");
		this.beg_bal = sc.nextInt();
		
		System.out.println("Enter total of all items charged by the customer this month");
		this.charges = sc.nextInt();

		System.out.println("Enter total of all credits applied to the customer’s account this month");
		this.credits = sc.nextInt();

		System.out.println("Enter allowed credit limit");
		this.limit = sc.nextInt();

	}
	
	public CreditLimit(int acc_num,int beg_bal,int charges,int credits,int limit) {
		this.acc_num = acc_num;
		this.beg_bal = beg_bal;
		this.charges = charges;
		this.credits = credits;
		this.limit = limit;
	}

	//Getters
	public int getAcc_num() {
		return acc_num;
	}

	public int getBeg_bal() {
		return beg_bal;
	}

	public int getCharges() {
		return charges;
	}

	public int getCredits() {
		return credits;
	}

	public int getLimit() {
		return limit;
	}
	
	//Setters

	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}

	public void setBeg_bal(int beg_bal) {
		this.beg_bal = beg_bal;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public int calculate_new_bal()
	{
		this.new_bal = this.beg_bal + this.charges - this.credits;
		
		return this.new_bal;
		
	}
	
	public void checkExceedsLimit()
	{
		System.out.println("The New Balance is "+calculate_new_bal());
		if (this.limit>calculate_new_bal())
		{
			System.out.println("The User with Account Number "+ this.acc_num+" doesnt exceeds the limit.");
		}
		else
		{
			System.out.println("The User with Account Number "+ this.acc_num+" exceeds the credit limit.");

		}
	}

	public static void main(String[] args) {
		CreditLimit user1 = new CreditLimit(101, 5000, 2000, 3000, 6000);
        user1.checkExceedsLimit();
        
        
        
        System.out.println("Enter details for User 2:");
        CreditLimit user2 = new CreditLimit(); 
        user2.checkExceedsLimit();

	}

}
