package com.training.ifaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import com.training.model.Apparel;
import com.training.model.Electronics;
import com.training.model.FoodItem;

//this interface provides contract to perform various functions with item
public interface ProductRetailDAO<T> {

	 
		boolean addFoodItems(FoodItem ...foodItems);
	    boolean addApparel(Apparel ...apparel);
	    void sortAll();
	    Collection<?> fetchResult(String productType);
	    boolean addElectonics(Electronics ...electronics);
	
	
	
	
}
