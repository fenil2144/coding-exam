package com.hsbc.service;

import java.util.List;

import com.hsbc.model.Electronics;

public interface ElectronicsService {
	public void add(Electronics electronics);
	public List<Electronics> getAllElectronics();
	
}
