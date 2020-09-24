package com.hsbc.service;

import java.util.List;

import com.hsbc.model.Apparel;

public interface ApparelService {

	public void add(Apparel apparel);
	public List<Apparel> getAllApparels();
}
