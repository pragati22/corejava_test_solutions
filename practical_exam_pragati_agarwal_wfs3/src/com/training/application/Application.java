/**
 * 
 */
package com.training.application;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
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
	
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		FoodItem milk = new FoodItem(101,"MILK",45.00,40,"24/10/2020","26/10/2020",true);
		FoodItem curd = new FoodItem(102,"CURD",100.00,30,"29/10/2020","30/10/2020",true);
		FoodItem cake = new FoodItem(103,"CAKE",200.00,40,"1/10/2020","3/10/2020",true);
		

		Apparel shirt = new Apparel(201, "SHIRT",  300.00,30, 30, "cotton");
		Apparel jeans = new Apparel(202, "JEANS", 700.00,10, 42, "cotton");
		Apparel coat = new Apparel(203, "COAT",2000.00,15,40, "woolen");
		
		Electronics tv = new Electronics(301,"TV", 10, 10, 40);
		Electronics radio = new Electronics(302,"RADIO", 40, 3, 10);
		Electronics watch = new Electronics(303,"WATCH", 20, 5, 15);
		      
		
		ProductRetailDAOimpl<T> productRetail = new ProductRetailDAOimpl<>();
		
		 boolean isUpdated;
		isUpdated=productRetail.addApparels(shirt,jeans,coat);
		if(isUpdated) {
		System.out.println("FOOD ITEMS ADDED"+isUpdated);
		}
		isUpdated=productRetail.addFoodItems(milk,curd,cake);
		if(isUpdated) {
			System.out.println("FOOD ITEMS ADDED"+isUpdated);
			}
		isUpdated=productRetail.addElectonics(tv,radio,watch);
		if(isUpdated) {
			System.out.println("FOOD ITEMS ADDED"+isUpdated);
			}
	        
	        productRetail.sortAll();
	        
	        int key;
	        do{
	        	System.out.println("1. view food items");
	 	        System.out.println("2. view apparel items");
	 	        System.out.println("3. view electronic items");
	 	        System.out.println("0. EXIT");
	 	        key=sc.nextInt();
		        switch(key) {
		        
		        case 1:
		        	
		        	Collection<?> foodList= productRetail.viewReport("foodItems");
			        productRetail.printList(foodList);
		        case 2:
		      
		        	Collection<?> apparelList= productRetail.viewReport("Apparels");
			        productRetail.printList(apparelList);
		        
		        case 3:
		        	Collection<?> electronicslist= productRetail.viewReport("Electronics");
			        productRetail.printList(electronicslist);
		        }
		        }while(key!=0);
	        
	        
	        
	        
	    }
		
	}


