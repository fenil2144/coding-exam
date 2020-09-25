package com.hsbc.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.model.Apparel;
import com.hsbc.utility.SortByQuantity;
import com.hsbc.utility.SortByQuantity.sortItemByElectronicsQuantity;

public class ApparelDaoImpl implements ApparelDao {

	private static List<Apparel> apparelList = new ArrayList<Apparel>();
	
	@Override
	public void add(Apparel apparel) {
		apparelList.add(apparel);
	}

	@Override
	public List<Apparel> getAllApparels() {
		SortByQuantity sortedList = new SortByQuantity();
		Collections.sort(apparelList, sortedList.new sortItemByApparelQuantity());
		return apparelList;
	}

}
