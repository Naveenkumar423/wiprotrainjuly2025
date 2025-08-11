package com.example.order_service.dto;

public class Payment {
    private int orderId;
    private boolean paymentStatus;
    private double amount;

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public boolean isPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(boolean paymentStatus) { this.paymentStatus = paymentStatus; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
