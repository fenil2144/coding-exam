package com.hsbc.service;

import java.util.List;

import com.hsbc.dao.FoodItemsDao;
import com.hsbc.model.FoodItems;
import com.hsbc.utility.FoodItemsFactory;
import com.hsbc.utility.Type;

public class FoodItemsServiceImpl implements FoodItemsService {

	private FoodItemsDao foodItemsDao;
	
	
	public FoodItemsServiceImpl() {
		super();
		foodItemsDao = (FoodItemsDao) FoodItemsFactory.getInstance(Type.DAO);
	}

	@Override
	public void add(FoodItems foodItems) {
		foodItemsDao.add(foodItems);
	}

	@Override
	public List<FoodItems> getAllFoodItems() {
		return foodItemsDao.getAllFoodItems();
	}

}
