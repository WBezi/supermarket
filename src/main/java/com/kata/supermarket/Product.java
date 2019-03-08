package com.kata.supermarket;

public class Product {

	private String label;
	private double price;

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

	public Product(String label, double price) {
		super();
		this.label = label;
		this.price = price;
	}

}
