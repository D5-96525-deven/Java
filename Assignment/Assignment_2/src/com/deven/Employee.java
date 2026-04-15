package com.deven;

public class Employee {
	String first_name,last_name;
	double sal;

	public Employee() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	public Employee(String first_name,String last_name,double sal) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.sal=sal;
	}
	
	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		if(sal<0)
		{
			System.out.println("Inavlid Salary");
		}
		else {
			this.sal = sal;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
