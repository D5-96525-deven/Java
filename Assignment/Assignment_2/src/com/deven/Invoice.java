package com.deven;
public class Invoice {

    private String partNumber, description;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
    	this.description=description;
    }

    public void setQuantity(int quantity) {
    	if (this.quantity <= 0) {
    	    this.quantity = 0;
    	}
    	this.quantity=quantity;
    }

    public void setPrice(double price) {
    	if (this.price <= 0) {
    	    this.price = 0.0;
    	}
    	this.price=price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}