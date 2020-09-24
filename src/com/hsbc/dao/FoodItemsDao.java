package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.FoodItems;

public interface FoodItemsDao {
	public void add(FoodItems foodItems);
	public List<FoodItems> getAllFoodItems();
}
