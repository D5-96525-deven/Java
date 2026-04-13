import java.util.Scanner;

public class Assignment1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int totalBill = 0;
		do {
			
			 System.out.println("1.  Dosa          ₹95");
	         System.out.println("2.  Samosa        ₹125");
	         System.out.println("3.  Idli          ₹145");
	         System.out.println("4.  Vada          ₹115");
	         System.out.println("5.  Puri          ₹125");
	         System.out.println("6.  Paratha       ₹65");
	         System.out.println("7.  Paneer Tikka  ₹45");
	         System.out.println("8.  Gulab Jamun   ₹115");
	         System.out.println("9.  Coffee        ₹90");
			 System.out.println("10.Calculate Bill");
			
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			switch (choice) 
				{
				case 1: 
					totalBill += 95; 
					System.out.println("Added Dosa"); 
					break;
                case 2: 
                	totalBill += 125; 
                	System.out.println("Added Samosa"); 
                	break;
                case 3: 
                	totalBill += 145; 
                	System.out.println("Added Idli"); 
                	break;
                case 4: 
                	totalBill += 115; 
                	System.out.println("Added Vada"); 
                	break;
                case 5: 
                	totalBill += 125; 
                	System.out.println("Added Puri"); 
                	break;
                case 6: 
                	totalBill += 65; 
                	System.out.println("Added Paratha"); 
                	break;
                case 7: 
                	totalBill += 45; 
                	System.out.println("Added Paneer Tikka"); 
                	break;
                case 8: 
                	totalBill += 115; 
                	System.out.println("Added Gulab Jamun"); 
                	break;
                case 9: 
                	totalBill += 90; 
                	System.out.println("Added Coffee"); 
                	break;
                case 10: 
                	System.out.println("\nGenerating your final bill..."); 
                	break;
                default: 
                	System.out.println("Invalid item! Please choose 1-10");
				}
			}
		while(choice !=10);
		
		System.out.println("TOTAL BILL AMOUNT: ₹" + totalBill);
	}
}
