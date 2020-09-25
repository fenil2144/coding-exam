package com.hsbc.controller;

import java.util.List;
import java.util.Scanner;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateItemCodeException;
import com.hsbc.model.Apparel;
import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItems;
import com.hsbc.model.Products;
import com.hsbc.service.ApparelService;
import com.hsbc.service.ElectronicsService;
import com.hsbc.service.FoodItemsService;
import com.hsbc.utility.ApparelFactory;
import com.hsbc.utility.ElectronicsFactory;
import com.hsbc.utility.FoodItemsFactory;
import com.hsbc.utility.MaterialType;
import com.hsbc.utility.Type;

public class MainViewController {

	public static void main(String[] args) throws CategoryNotFoundException {
		Scanner scanner = new Scanner(System.in);
		
		int option = 0;
		do {
			System.out.println("*****************************************************************************************");
			System.out.println("Please enter the Category");
			System.out.println("1.Store Electronics 2.Store Apparel 3. Store FoodItems 4:Get Food Items  5:Get Apparel  6: Electronics 7: Exit");
			System.out.println("*****************************************************************************************");
			option = scanner.nextInt();
			switch(option) {
			
			case 1:
				System.out.println("Enter the ItemCode");
				long itemCode=scanner.nextInt();
				System.out.println("Enter the ItemName");
				String itemName=scanner.next();
				System.out.println("Enter the  unit price");
				double unitPrice=scanner.nextInt();
				System.out.println("Enter the Warranty");
				int warranty=scanner.nextInt();
				System.out.println("Enter the Quantity");
				int quantity=scanner.nextInt();
				Electronics electronics=new Electronics(itemCode,itemName,unitPrice,quantity,warranty);
				ElectronicsService electronicsService = (ElectronicsService) ElectronicsFactory.getInstance(Type.SERVICE);
				
				electronicsService.add(electronics);
				break;
				
			case 2:
				
				System.out.println("Enter the ItemCode");
			    itemCode=scanner.nextInt();
				System.out.println("Enter the ItemName");
				itemName =scanner.next();
				System.out.println("Enter the  unit price");
				unitPrice=scanner.nextInt();
				System.out.println("Enter the Size");
				String size=scanner.next();
				System.out.println("Enter the material");
				String material=scanner.next();
				System.out.println("Enter the Quantity");
				quantity=scanner.nextInt();
				Apparel apparel=new Apparel(itemCode,itemName, unitPrice,  quantity,  size,  material);
				ApparelService apparelService = (ApparelService) ApparelFactory.getInstance(Type.SERVICE);

				apparelService.add(apparel);
				break;
			case 3:
				System.out.println("Enter the ItemCode");
			    itemCode=scanner.nextInt();
				System.out.println("Enter the ItemName");
				itemName=scanner.next();
				System.out.println("Enter the  unit price");
				unitPrice=scanner.nextInt();
				System.out.println("Enter the DateofManufacture");
				String date_manufacture=scanner.next();
				System.out.println("Enter the DateofExpiry");
				String date_expiry=scanner.next();
				System.out.println("Enter the Vegetarian");
				String veg=scanner.next();
				System.out.println("Enter the Quantity");
				quantity=scanner.nextInt();
				
				FoodItems food=new FoodItems(itemCode,itemName,unitPrice,quantity,date_manufacture,date_expiry,veg);
				FoodItemsService foodItemsService = (FoodItemsService) FoodItemsFactory.getInstance(Type.SERVICE);

				foodItemsService.add(food);
				break;
				
				
			case 4:
				try {	
					
				// This is getting service object from Factory class.
				FoodItemsService foodItemsService1 = (FoodItemsService) FoodItemsFactory.getInstance(Type.SERVICE);
				List<FoodItems> foodItemsList= foodItemsService.getAllFoodItems();
				int count=1;
			    for(FoodItems foodItems:foodItemsList)
			    {
				    if(count<4)
				   {
					 System.out.println(foodItems);
					 count++;
				   }
				
			    }
			}
            catch (DuplicateItemCodeException e) {
				
				System.out.println(e.getMessage());
			}

				break;
			case 5: 
				try {			
				
				// This is getting service object from Factory class.
				ApparelService apparelService1 = (ApparelService) ApparelFactory.getInstance(Type.SERVICE);
				List<Apparel> apparelList= apparelService.getAllApparels();
				int token=1;
				for(Apparel apparel2:apparelList)
				   {
					     if(token<4)
					    {
						   System.out.println(apparel2);
						   token++;
					    }
					
				   }
				}
             catch (DuplicateItemCodeException e) {
					
					System.out.println(e.getMessage());
				}

				break;
			case 6:
				// This is getting service object from Factory class.
				ElectronicsService electronicsService1 = (ElectronicsService) ElectronicsFactory.getInstance(Type.SERVICE);
				List<Electronics> electronicsList= electronicsService.getAllElectronics();
				
				try {
					ElectronicsService electronicsService2 = (ElectronicsService) ElectronicsFactory.getInstance(Type.SERVICE);
					List<Electronics> electronicsList1 = electronicsService.getAllElectronics();
					int token=1;
					for(Electronics electronics1:electronicsList1)
					{
						if(token<4)
						{
							System.out.println(electronics1);
							token++;
						}
						
					}
				} catch (DuplicateItemCodeException e) {
					
					System.out.println(e.getMessage());
				}

				break;
			default:
				throw new CategoryNotFoundException();
			}
		} while(option != 7);
		
		scanner.close();
	}

}
