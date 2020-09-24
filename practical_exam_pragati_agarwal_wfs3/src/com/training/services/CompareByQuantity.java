package com.training.services;

import java.util.Comparator;

import com.training.model.FoodItem;
import com.training.model.Product;

public class CompareByQuantity implements Comparator<Product> {

	
	@Override
	public int compare(Product product1, Product product2) {
		//compare quantities and return respective values
		if(product1.getQuantity()<product2.getQuantity()) return -1;
		if(product1.getQuantity()>product2.getQuantity()) return 1;
		return 0;
	}

}
