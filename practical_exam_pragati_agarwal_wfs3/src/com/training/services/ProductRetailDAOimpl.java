package com.training.services;

import java.util.ArrayList;
/* @ Author PRAGATI
 * 
 * purpose - services like add item and view item after sorting
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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
      

    public ProductRetailDAOimpl() {
		super();
	
	}

	public ProductRetailDAOimpl(ArrayList<FoodItem> foodItems, ArrayList<Apparel> apparels,
			ArrayList<Electronics> electronics, List<FoodItem> foodList, List<Apparel> apparelList,
			List<Electronics> electronicsList) {
		super();
		this.foodItems = foodItems;
		this.apparels = apparels;
		this.electronics = electronics;
	
	}
	
	//method to add food items to food item list
	@Override
    public boolean addFoodItems(FoodItem... foodItems) {
        
        boolean result =false;
        
        for(FoodItem f: foodItems)
        {
            try {
				this.foodItems.add(f);
				result=true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
            return result;
            
    }
	
	//method to add electronics items to item list
    @Override
    public boolean addElectonics(Electronics... electronics) {
        
        boolean result =false;
        
        for(Electronics e: electronics)
        {
            try {
				this.electronics.add(e);
				result=true;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
            return result;
    }

  //method to add apparels items to apparel item list
    @Override
    public boolean addApparels(Apparel... apparels) {
        boolean result =false;
        
		for(Apparel a: apparels)
        {
            try {
				this.apparels.add(a);
				result=true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	}
        
        
            return result;
    }

    //to fetch result on the basis of category
    @Override
    public Collection<?> viewReport(String productType) {
        
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

	//to sort list on the basis of quantity
    @Override
    public void sortAll() {
        
    	//Comparator class to compare products or items with quantity as parameter
    	CompareByQuantity quantityComparator= new CompareByQuantity();
    	
    	foodItems.sort(quantityComparator);
    	electronics.sort(quantityComparator);
    	apparels.sort(quantityComparator);
      
    }
    
    // to print the list
    public void printList(Collection<?> invList)
    {
        Iterator<?> itrator= invList.iterator();
        int count = 0;
        while(itrator.hasNext() && count<3)
        {
            System.out.println(itrator.next());
            count++;
                    
        }
    }

    
}


