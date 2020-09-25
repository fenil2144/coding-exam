package com.hsbc.model;

import com.hsbc.utility.MaterialType;

public class Apparel extends Products{
	
	private double size;
	private MaterialType material;
	
	public Apparel(long itemCode, String itemName, double unitPrice, int quantity, double size, MaterialType material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public MaterialType getMaterial() {
		return material;
	}

	public void setMaterial(MaterialType material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + ", getItemCode()=" + getItemCode()
				+ ", getItemName()=" + getItemName() + ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()="
				+ getQuantity() + "]";
	}
	

	
}
