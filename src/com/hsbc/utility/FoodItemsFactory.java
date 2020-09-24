package com.hsbc.utility;

import com.hsbc.dao.FoodItemsDaoImpl;
import com.hsbc.service.FoodItemsServiceImpl;

public class FoodItemsFactory {
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new FoodItemsDaoImpl();
			break;
		case SERVICE :
			obj = new FoodItemsServiceImpl();
			break;
		}
		return obj;
	}
}
