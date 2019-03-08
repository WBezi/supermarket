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
}
