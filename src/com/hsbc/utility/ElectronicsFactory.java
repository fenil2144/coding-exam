package com.hsbc.utility;

import com.hsbc.dao.ElectronicsDaoImpl;
import com.hsbc.service.ElectronicsServiceImpl;

public class ElectronicsFactory {
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new ElectronicsDaoImpl();
			break;
		case SERVICE :
			obj = new ElectronicsServiceImpl();
			break;
		}
		return obj;
	}
}
