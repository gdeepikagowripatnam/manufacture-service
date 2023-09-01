package com.manufacture.manage.model;

public class OrderItemModel {
	private int orderItemId;

	private int bookId;

	private double price;

	private int quantity;

	private double subTotalAmount;

	private OrdersModel ordersModel;

	public OrderItemModel() {
		super();
	}

	public OrderItemModel(int orderItemId, int bookId, double price, int quantity, double subTotalAmount,
			OrdersModel ordersModel) {
		super();
		this.orderItemId = orderItemId;
		this.bookId = bookId;
		this.price = price;
		this.quantity = quantity;
		this.subTotalAmount = subTotalAmount;
		this.ordersModel = ordersModel;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(double subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	public OrdersModel getOrdersModel() {
		return ordersModel;
	}

	public void setOrdersModel(OrdersModel ordersModel) {
		this.ordersModel = ordersModel;
	}

	@Override
	public String toString() {
		return "OrderItemModel [orderItemId=" + orderItemId + ", bookId=" + bookId + ", price=" + price + ", quantity="
				+ quantity + ", subTotalAmount=" + subTotalAmount + ", ordersModel=" + ordersModel + "]";
	}

}
