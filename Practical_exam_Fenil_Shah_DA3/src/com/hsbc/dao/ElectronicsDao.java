package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Electronics;

public interface ElectronicsDao {

	public void add(Electronics electronics);
	public List<Electronics> getAllElectronics();
	
}
