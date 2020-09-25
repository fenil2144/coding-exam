package com.hsbc.model;

import java.util.Date;

public class FoodItems  extends Products{
	
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private boolean isVegetarian;
	
	public FoodItems(long itemCode, String itemName, double unitPrice, int quantity, Date dateOfManufacture,
			Date dateOfExpiry, boolean isVegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
	}
	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry
				+ ", isVegetarian=" + isVegetarian + ", getItemCode()=" + getItemCode() + ", getItemName()="
				+ getItemName() + ", getUnitPrice()=" + getUnitPrice() + ", getQuantity()=" + getQuantity() + "]";
	}
	
	


	
	
}
