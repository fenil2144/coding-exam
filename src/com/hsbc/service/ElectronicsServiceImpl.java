package com.hsbc.service;

import java.util.List;

import com.hsbc.dao.ElectronicsDao;
import com.hsbc.model.Electronics;
import com.hsbc.utility.ElectronicsFactory;
import com.hsbc.utility.Type;

public class ElectronicsServiceImpl implements ElectronicsService {

	private ElectronicsDao electronicsDao;
	
	public ElectronicsServiceImpl() {
		super();
		electronicsDao = (ElectronicsDao) ElectronicsFactory.getInstance(Type.DAO);
	}

	@Override
	public void add(Electronics electronics) {
		electronicsDao.add(electronics);

	}

	@Override
	public List<Electronics> getAllElectronics() {
		return electronicsDao.getAllElectronics();
	}

}
