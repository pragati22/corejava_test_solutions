package com.training.model;
/*
 * @AUTHOR PRAGATI
 * 
 * PARENT class that has attributes extended by food,electronics,apparels
 */
public class Product {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int itemCode, String itemName, double unitPrice, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + "]";
	}
	
	
}
