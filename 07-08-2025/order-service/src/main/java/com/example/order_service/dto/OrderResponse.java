package com.example.order_service.dto;

public class OrderResponse {
    private int id;
    private String orderNumber;
    private double orderValue;
    private String orderStatus;
    private Payment payment;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public double getOrderValue() { return orderValue; }
    public void setOrderValue(double orderValue) { this.orderValue = orderValue; }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) { this.payment = payment; }
}
