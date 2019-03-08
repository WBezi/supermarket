package com.kata.supermarket;

import java.util.HashMap;
import java.util.Map;

public class Basket {

	private Map<Product, Integer> products;
	private double balance;

	public Basket() {
		super();
		this.products = new HashMap<>();
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
