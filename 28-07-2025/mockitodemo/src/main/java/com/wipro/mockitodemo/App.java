package com.wipro.mockitodemo;

public class App {
	public static void main(String[] args) {
        OrderService service = new OrderService();
        String result = service.placeOrder("ORD-01");
        System.out.println("Order result: " + result);  // Will print null (default)
    }
}
