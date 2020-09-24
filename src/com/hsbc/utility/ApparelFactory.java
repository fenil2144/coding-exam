package com.hsbc.utility;

import com.hsbc.dao.ApparelDaoImpl;
import com.hsbc.service.ApparelServiceImpl;

public class ApparelFactory {

	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new ApparelDaoImpl();
			break;
		case SERVICE :
			obj = new ApparelServiceImpl();
			break;
		}
		return obj;
	}
}
