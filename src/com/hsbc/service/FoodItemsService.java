package com.hsbc.service;

import java.util.List;

import com.hsbc.model.FoodItems;

public interface FoodItemsService {
	
	public void add(FoodItems foodItems);
	public List<FoodItems> getAllFoodItems();
}
