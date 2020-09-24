/**
 * 
 */
package com.training.model;

/**
 * @author PRAGATI
 *
 *purpose-This class states the attributes of entity apparels
 */
public class Apparel extends Product {

	private int size;
	private String material;

	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode, String itemName, double unitPrice, int quantity,int size, String material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + size;
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
		Apparel other = (Apparel) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + "]";
	}
	
	
}
