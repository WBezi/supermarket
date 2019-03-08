package com.kata.supermarket;

public class Discount {

	private Integer amount;
	private double newPrice;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

	public Discount(Integer amount, double newPrice) {
		super();
		this.amount = amount;
		this.newPrice = newPrice;
	}

}
