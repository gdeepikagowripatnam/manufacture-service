package com.manufacture.manage.model;

import java.time.LocalDate;
import java.util.List;

public class OrdersModel {
	private int orderId;

	private String description;

	private LocalDate orderDate;

	private double orderTotalAmount;

	private int totalItems;

	private int customerId;

	private List<OrderItemModel> orderItemList;

	private OrderStatusModel orderStatusModel;

	private PaymentStatusModel paymentStatusModel;

	private ShipmentStatusModel shipmentStatusModel;

	public OrdersModel() {
		super();
	}

	public OrdersModel(int orderId, String description, LocalDate orderDate, double orderTotalAmount, int totalItems,
			int customerId, List<OrderItemModel> orderItemList, OrderStatusModel orderStatusModel,
			PaymentStatusModel paymentStatusModel, ShipmentStatusModel shipmentStatusModel) {
		super();
		this.orderId = orderId;
		this.description = description;
		this.orderDate = orderDate;
		this.orderTotalAmount = orderTotalAmount;
		this.totalItems = totalItems;
		this.customerId = customerId;
		this.orderItemList = orderItemList;
		this.orderStatusModel = orderStatusModel;
		this.paymentStatusModel = paymentStatusModel;
		this.shipmentStatusModel = shipmentStatusModel;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderTotalAmount() {
		return orderTotalAmount;
	}

	public void setOrderTotalAmount(double orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<OrderItemModel> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItemModel> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public OrderStatusModel getOrderStatusModel() {
		return orderStatusModel;
	}

	public void setOrderStatusModel(OrderStatusModel orderStatusModel) {
		this.orderStatusModel = orderStatusModel;
	}

	public PaymentStatusModel getPaymentStatusModel() {
		return paymentStatusModel;
	}

	public void setPaymentStatusModel(PaymentStatusModel paymentStatusModel) {
		this.paymentStatusModel = paymentStatusModel;
	}

	public ShipmentStatusModel getShipmentStatusModel() {
		return shipmentStatusModel;
	}

	public void setShipmentStatusModel(ShipmentStatusModel shipmentStatusModel) {
		this.shipmentStatusModel = shipmentStatusModel;
	}

	@Override
	public String toString() {
		return "OrdersModel [orderId=" + orderId + ", description=" + description + ", orderDate=" + orderDate
				+ ", orderTotalAmount=" + orderTotalAmount + ", totalItems=" + totalItems + ", customerId=" + customerId
				+ ", orderItemList=" + orderItemList + ", orderStatusModel=" + orderStatusModel
				+ ", paymentStatusModel=" + paymentStatusModel + ", shipmentStatusModel=" + shipmentStatusModel + "]";
	}

}
