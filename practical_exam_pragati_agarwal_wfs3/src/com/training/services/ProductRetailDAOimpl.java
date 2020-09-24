package com.training.services;

import java.util.ArrayList;
/* @ Author PRAGATI
 * 
 * purpose - services like add item and view item after sorting
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.training.ifaces.ProductRetailDAO;
import com.training.model.Apparel;
import com.training.model.Electronics;
import com.training.model.FoodItem;


//implementation of productDAO class
public class ProductRetailDAOimpl<T> implements ProductRetailDAO<T> {

	private ArrayList<FoodItem> foodItems = null;
	private ArrayList<Apparel>  apparels= null;
	private ArrayList<Electronics> electronics = null;
      

    public ProductRetailDAOimpl(ArrayList<FoodItem> foodItems, ArrayList<Apparel> apparels,
			ArrayList<Electronics> electronics, List<FoodItem> foodList, List<Apparel> appList,
			List<Electronics> elecList) {
		super();
		this.foodItems = foodItems;
		this.apparels = apparels;
		this.electronics = electronics;
	
	}

	@Override
    public boolean addFoodItems(FoodItem... foodItems) {
        
        boolean result =false;
        
        for(FoodItem f: foodItems)
        {
            this.foodItems.add(f);
            result=true;
        }
            return result;
            
    }

    @Override
    public boolean addElectonics(Electronics... electronics) {
        
        boolean result =false;
        
        for(Electronics e: electronics)
        {
            this.electronics.add(e);
            result=true;
        }
            return result;
    }

    @Override
    public boolean addApparel(Apparel... apparels) {
        boolean result =false;
        
		for(Apparel a: apparels)
        {
            this.apparels.add(a);
            result=true;
        }
            return result;
    }

    @Override
    public void sortAll() {
        
        Collections.sort(this.foodItems);
        Collections.sort(this.electronics);
        Collections.sort(this.apparels);
    }

    @Override
    public Collection<?> fetchResult(String productType) {
        
        if(productType.equalsIgnoreCase("FoodItems"))
            return this.foodItems;
        else
            if(productType.equalsIgnoreCase("Apparel"))
                return this.apparels;
        else
                if(productType.equalsIgnoreCase("Electronics"))
                    return this.electronics;
        
        return null;
    }

	public ProductRetailDAOimpl() {
		super();
		// TODO Auto-generated constructor stub
	}
}


