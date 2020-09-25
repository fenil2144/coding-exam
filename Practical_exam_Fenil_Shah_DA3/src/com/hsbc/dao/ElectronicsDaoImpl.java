package com.hsbc.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.model.Electronics;
import com.hsbc.utility.SortByQuantity;

public class ElectronicsDaoImpl implements ElectronicsDao {
	//Temporary database
	private static List<Electronics> electronicList = new ArrayList<Electronics>();
	
	@Override
	public void add(Electronics electronics) {
		electronicList.add(electronics);
	}

	@Override
	public List<Electronics> getAllElectronics() {
		SortByQuantity sortedList = new SortByQuantity();
		Collections.sort(electronicList, sortedList.new sortItemByElectronicsQuantity());
		return electronicList;
	}

}
