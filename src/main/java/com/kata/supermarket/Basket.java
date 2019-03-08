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

	public void addProduct(Product p) {
		if (!this.products.containsKey(p)) {
			this.products.put(p, 1);
		} else {
			this.products.put(p, this.products.get(p) + 1);
		}
		this.updateBalance();
	}

	private void updateBalance() {
		this.setBalance(0);
		this.products.forEach((p, q) -> {
			if(p.getDiscount() == null) {
				this.setBalance(this.getBalance() + p.getPrice() * q);
			} else {
				double total = (q % p.getDiscount().getAmount()) * p.getPrice() + (q / p.getDiscount().getAmount()) * p.getDiscount().getNewPrice();
				this.setBalance(this.getBalance() + total);
			}
		});
	}

}
