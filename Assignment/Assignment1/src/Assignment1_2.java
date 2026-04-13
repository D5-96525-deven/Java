import java.util.Scanner;

public class Assignment1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Num 1: ");
		Double dnum1 = sc.nextDouble();
		
		System.out.println("Enter the Num 2: ");
		Double dnum2 = sc.nextDouble();
		

		
		if (dnum1 instanceof Double && dnum2 instanceof Double) {
			System.out.println("Num 1 and 2 is Double and avg is " + (dnum1+dnum2)/2);
		}
		else
		{
			System.out.println("One of them is not Double");
		}
	}

}
