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
	    boolean addApparels(Apparel ...apparels);
	    boolean addElectonics(Electronics ...electronics);
	    Collection<?> viewReport(String productType);
	    public void printList(Collection<?> invList);
	    void sortAll();

}
