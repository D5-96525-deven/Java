package com.deven;

public class Q6 {

    static class ECommerceException extends Exception {
        public ECommerceException(String msg) {
            super(msg);
        }
    }

    static class PaymentException extends ECommerceException {
        public PaymentException(String msg) {
            super(msg);
        }
    }

    static class InventoryException extends ECommerceException {
        public InventoryException(String msg) {
            super(msg);
        }
    }

    static class ShippingException extends ECommerceException {
        public ShippingException(String msg) {
            super(msg);
        }
    }

    static void processPayment(double amount) throws PaymentException {
        if (amount <= 0) throw new PaymentException("Invalid payment amount");
    }

    static void checkInventory(int stock) throws InventoryException {
        if (stock == 0) throw new InventoryException("Out of stock");
    }

    static void shipOrder(String address) throws ShippingException {
        if (address.isEmpty()) throw new ShippingException("Invalid address");
    }

    public static void main(String[] args) {
        try {
            processPayment(0);
            checkInventory(0);
            shipOrder("");
        } catch (ECommerceException e) {
            System.out.println(e.getMessage());
        }
    }
}
