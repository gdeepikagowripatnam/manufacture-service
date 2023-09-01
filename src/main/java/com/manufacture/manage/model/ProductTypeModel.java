package com.manufacture.manage.model;

public class ProductTypeModel {
	private int categoryId;
	private String categoryName;
	
	public ProductTypeModel() {
		super();
	}
	public ProductTypeModel(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "ProductTypeModel [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	

}
