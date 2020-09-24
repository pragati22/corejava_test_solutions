/**
 * 
 */
package com.training.model;

/**
 * @author PRAGATI AGARWAL
 *
 * purpose - This class states the attributes of entity food item
 */
public class FoodItem extends Product{
	
	
	private String dateOfManufacture;
	private String dateOfExpiry;
	private boolean isVegetarian;
	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItem(int itemCode, String itemName, double unitPrice, int quantity,String dateOfManufacture, String dateOfExpiry, boolean isVegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
	
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
		// TODO Auto-generated constructor stub
	}
	
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + (isVegetarian ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItem other = (FoodItem) obj;
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfManufacture == null) {
			if (other.dateOfManufacture != null)
				return false;
		} else if (!dateOfManufacture.equals(other.dateOfManufacture))
			return false;
		if (isVegetarian != other.isVegetarian)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FoodItem [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", isVegetarian="
				+ isVegetarian + "]";
	}
	

}
