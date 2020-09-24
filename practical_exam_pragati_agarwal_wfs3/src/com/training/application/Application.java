/**
 * 
 */
package com.training.application;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.training.model.Apparel;
import com.training.model.Electronics;
import com.training.model.FoodItem;
import com.training.services.ProductRetailDAOimpl;

/**
 * @author PRAGATI
 * this class executes main functionality
 */
public class Application {

	/**
	 * @param <T>
	 * @param args
	 */
	public static void printList(Collection<?> invList)s
    {
        Iterator<?> itr= invList.iterator();
         int count = 0;
        while(itr.hasNext() && count<3)
        {
            System.out.println(itr.next());
            count++;
                    
        }
    }
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		 boolean result;
		FoodItem milk = new FoodItem(101,"MILK",45.00,40,"24/10/2020","26/10/2020",true);
		FoodItem curd = new FoodItem(102,"CURD",100.00,30,"29/10/2020","30/10/2020",true);
		FoodItem cake = new FoodItem(103,"CAKE",200.00,40,"1/10/2020","3/10/2020",true);
		

		Apparel shirt = new Apparel(201, "SHIRT",  300.00,30, 30, "cotton");
		Apparel jeans = new Apparel(202, "JEANS", 700.00,10, 42, "cotton");
		Apparel coat = new Apparel(203, "COAT",2000.00,15,40, "woolen");
		
		Electronics tv = new Electronics(301,"TV", 10, 10, 40);
		Electronics radio = new Electronics(302,"RADIO", 40, 3, 10);
		Electronics watch = new Electronics(303,"WATCH", 20, 5, 15);
			
		
		Set<FoodItem> foods=new HashSet<FoodItem>();
		Set<Apparel> apparels=new HashSet<Apparel>();
		Set<Electronics> electronics=new HashSet<Electronics>();
	        
	        
	        ProductRetailDAOimpl<T> product = new ProductRetailDAOimpl<>();
	        result=product.addFoodItems(milk,curd,cake);
	        System.out.println(result);
	        result=product.addApparel(shirt,jeans,coat);
	        System.out.println(result);
	        result=product.addElectonics(tv,radio,watch);
	        System.out.println(result);
	        
	        
	        product.sortAll();
	        
	        
	        Collection<?> list= product.fetchResult(foods);
	        printList(list);
	        
	        
	        
	        
	    }
		
	}


