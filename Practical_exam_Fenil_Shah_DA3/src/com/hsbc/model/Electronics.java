package com.hsbc.model;

public class Electronics extends Products{

	private int warrantyMonths;

	public Electronics(long itemCode, String itemName, double unitPrice, int quantity, int warrantyMonths) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warrantyMonths = warrantyMonths;
	}

	public int getWarrantyMonths() {
		return warrantyMonths;
	}

	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}

	@Override
	public String toString() {
		return "Electronics [warrantyMonths=" + warrantyMonths + ", getItemCode()=" + getItemCode() + ", getItemName()="
				+ getItemName() + ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()=" + getQuantity() + "]";
	}
	
	
}
