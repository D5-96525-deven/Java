package com.deven;
import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Part Number: ");
        String partNumber = sc.nextLine();

        System.out.print("Enter Description: ");
        String description = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per item: ");
        double price = sc.nextDouble();

        Invoice invoice = new Invoice(partNumber, description, quantity, price);

        System.out.println(invoice.getPartNumber());
        System.out.println(invoice.getDescription());
        System.out.println(invoice.getQuantity());
        System.out.println(invoice.getPrice());
        System.out.println(invoice.getInvoiceAmount());

    }
}