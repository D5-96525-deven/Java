package com.deven;

public class EmployeeTest {

	public EmployeeTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	Employee emp1 = new Employee("Deven","Deshmukh",1000.0);
	Employee emp2 = new Employee("ABC","XYZ",1200.0);
	
	public void printEmp()
	{
		System.out.println("Emp 1 Name: "+emp1.first_name+" "+emp1.last_name);
		System.out.println("Emp 1 Annual Salary: "+emp1.sal*12);
		
		System.out.println();
		
		System.out.println("Emp 2 Name: "+emp2.first_name+" "+emp2.last_name);
		System.out.println("Emp 2 Annual Salary: "+emp2.sal*12);
		
	}
	
	public void hikeSal()
	{
		emp1.sal = emp1.sal * 1.10;
		emp2.sal = emp2.sal * 1.10;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Salary After Hike of 10%");
		
		printEmp();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTest et1 = new EmployeeTest();
		
		et1.printEmp();
		et1.hikeSal();

	}

}
