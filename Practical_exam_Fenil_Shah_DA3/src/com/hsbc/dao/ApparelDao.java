package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Apparel;

public interface ApparelDao {
	public void add(Apparel apparel);
	public List<Apparel> getAllApparels();
}
