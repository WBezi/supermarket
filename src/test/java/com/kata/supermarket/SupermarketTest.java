package com.kata.supermarket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SupermarketTest {

	private Basket basket;

	@Before
	public void setUp() {
		this.basket = new Basket();
	}

	@Test
	public void testEmptyBasket() {
		Assert.assertEquals("0.0", String.valueOf((this.basket.getBalance())));
	}

	@Test
	public void testBasketWithoutDiscount() {
		Product p1 = new Product("P1", 3.1);
		Product p2 = new Product("P2", 2.6);
		Product p3 = new Product("P3", 5.0);

		this.basket.addProduct(p1);
		this.basket.addProduct(p2);
		this.basket.addProduct(p1);
		this.basket.addProduct(p3);

		Assert.assertEquals("13.8", String.valueOf((this.basket.getBalance())));
	}

	@Test
	public void testBasketWithOneDiscount() {
		Product p1 = new Product("P1", 3.1, new Discount(2, 5.0));
		Product p2 = new Product("P2", 2.6);
		Product p3 = new Product("P3", 5.0);

		this.basket.addProduct(p1);
		this.basket.addProduct(p2);
		this.basket.addProduct(p1);
		this.basket.addProduct(p3);

		Assert.assertEquals("12.6", String.valueOf((this.basket.getBalance())));
	}

	@Test
	public void testBasketWithTwoDiscountsInSameProduct() {
		Product p1 = new Product("P1", 3.1, new Discount(2, 5.0));
		Product p2 = new Product("P2", 2.6);
		Product p3 = new Product("P3", 5.0);

		this.basket.addProduct(p1);
		this.basket.addProduct(p2);
		this.basket.addProduct(p1);
		this.basket.addProduct(p1);
		this.basket.addProduct(p1);
		this.basket.addProduct(p3);

		Assert.assertEquals("17.6", String.valueOf((this.basket.getBalance())));
	}

	@Test
	public void testBasketWithDiscounts() {
		Product p1 = new Product("P1", 3.1, new Discount(2, 5.0));
		Product p2 = new Product("P2", 2.6);
		Product p3 = new Product("P3", 5.0, new Discount(3, 12.0));

		this.basket.addProduct(p1);
		this.basket.addProduct(p2);
		this.basket.addProduct(p1);
		this.basket.addProduct(p1);
		this.basket.addProduct(p3);
		this.basket.addProduct(p3);

		this.basket.addProduct(p1);
		this.basket.addProduct(p3);

		this.basket.addProduct(p3);
		this.basket.addProduct(p3);

		this.basket.addProduct(p2);
		this.basket.addProduct(p3);

		Assert.assertEquals("39.2", String.valueOf((this.basket.getBalance())));
	}
}
