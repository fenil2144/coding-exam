package com.hsbc.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.model.FoodItems;
import com.hsbc.utility.SortByQuantity;
import com.hsbc.utility.SortByQuantity.sortItemByApparelQuantity;

public class FoodItemsDaoImpl implements FoodItemsDao {

	//Temporary Database for storing items
	private static List<FoodItems> foodItemList = new ArrayList<FoodItems>();
	
	@Override
	public void add(FoodItems foodItems) {
		foodItemList.add(foodItems);
	}

	@Override
	public List<FoodItems> getAllFoodItems() {
		SortByQuantity sortedList = new SortByQuantity();
		Collections.sort(foodItemList, sortedList.new sortItemByFoodItemsQuantity());
		return foodItemList;
	}

}
