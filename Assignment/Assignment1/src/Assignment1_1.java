
import java.util.Scanner;


public class Assignment1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num:");
		int num = sc.nextInt();
		
		Integer i = num;
		
		System.out.println("Decimal :"+i);
		
		System.out.println("Binary :"+i.toBinaryString(num));
		
		System.out.println("Octal :"+i.toOctalString(num));
		
		System.out.println("Hexa Decimal :"+i.toHexString(num));
		
		
		

	}

}
