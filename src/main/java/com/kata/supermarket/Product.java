package com.kata.supermarket;

public class Product {

	private String label;
	private double price;
	private Discount discount;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Product(String label, double price) {
		super();
		this.label = label;
		this.price = price;
	}

	public Product(String label, double price, Discount d) {
		super();
		this.label = label;
		this.price = price;
		this.discount = d;
	}

}
