package com.hsbc.service;

import java.util.List;

import com.hsbc.dao.ApparelDao;
import com.hsbc.model.Apparel;
import com.hsbc.utility.ApparelFactory;
import com.hsbc.utility.Type;

public class ApparelServiceImpl implements ApparelService {

	private ApparelDao apparelDao;
	

	public ApparelServiceImpl() {
		super();
		apparelDao = (ApparelDao) ApparelFactory.getInstance(Type.DAO);
	}

	@Override
	public void add(Apparel apparel) {
		apparelDao.add(apparel);
	}

	@Override
	public List<Apparel> getAllApparels() {
		return apparelDao.getAllApparels();
	}

}
