package com.manufacture.manage.model;

import java.time.LocalDate;


public class ProductModel {
	private int productId;
	private String productName;
	private String description;
	private double price;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;
	
	private CategoryModel categoryModel;
	private ProductTypeModel productTypeModel;
	
	public ProductModel() {
		super();
	}
	public ProductModel(int productId, String productName, String description, double price, LocalDate manufactureDate,
			LocalDate expiryDate, CategoryModel categoryModel, ProductTypeModel productTypeModel) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.categoryModel = categoryModel;
		this.productTypeModel = productTypeModel;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public CategoryModel getCategoryModel() {
		return categoryModel;
	}
	public void setCategoryModel(CategoryModel categoryModel) {
		this.categoryModel = categoryModel;
	}
	public ProductTypeModel getProductTypeModel() {
		return productTypeModel;
	}
	public void setProductTypeModel(ProductTypeModel productTypeModel) {
		this.productTypeModel = productTypeModel;
	}
	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate
				+ ", categoryModel=" + categoryModel + ", productTypeModel=" + productTypeModel + "]";
	}
	

}
