package com.ygu.cart;
import org.json.simple.JSONObject;
public class ItemFullSpecification extends JSONObject {

	private String itemName;
	private boolean sale = false;
	private double itemPrice;
	private long condition;
	private double discount;
	private String saleType;

	protected boolean isSale() {
		return this.sale;
	}

	protected void setSale(boolean sale) {
		this.sale = sale;
	}

	public ItemFullSpecification(String itemName) {
		this.itemName = itemName;
	}



	public ItemFullSpecification() {
		// TODO Auto-generated constructor stub
	}

	protected String getItemName() {
		return itemName;
	}

	protected void setItemName(String itemName) {
		this.itemName = itemName;
	}

	protected double getItemPrice() {
		return itemPrice;
	}

	protected void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	protected long getCondition() {
		return condition;
	}

	protected void setCondition(long condition) {
		this.condition = condition;
	}

	protected double getDiscount() {
		return discount;
	}

	protected void setDiscount(double discount) {
		this.discount = discount;
	}

	protected String getSaleType() {
		return saleType;
	}

	protected void setSaleType(String saleType) {
		this.saleType = saleType;
	}

}
