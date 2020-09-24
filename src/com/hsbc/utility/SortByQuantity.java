package com.hsbc.utility;

import java.util.Comparator;

import com.hsbc.model.Apparel;
import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItems;

public class SortByQuantity {
	 public class sortItemByElectronicsQuantity implements Comparator<Electronics>
	{

		@Override
		public int compare(Electronics o1, Electronics o2)
		{
		return o2.getQuantity()-o1.getQuantity();
		}
		
	}
	public class sortItemByApparelQuantity implements Comparator<Apparel>
	{

		@Override
		public int compare(Apparel o1, Apparel  o2)
		{
		  return o2.getQuantity()-o1.getQuantity();
		}
		
	}
	public class sortItemByFoodItemsQuantity implements Comparator<FoodItems>
	{

		@Override
		public int compare(FoodItems o1,FoodItems o2)
		{
		return o2.getQuantity()-o1.getQuantity();
		}
		
	}
}
