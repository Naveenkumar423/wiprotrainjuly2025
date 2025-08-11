package com.example.order_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")  // ✅ Avoids conflict with SQL reserved word
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String orderNumber;
    private double orderValue;
    private String orderStatus;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public double getOrderValue() { return orderValue; }
    public void setOrderValue(double orderValue) { this.orderValue = orderValue; }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
	public double getAmount() {
		// TODO Auto-generated method stub
		return orderValue;
	}
}
