package com.ygu.cart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShoppingJunitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShopping() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetShoppingCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckOut() {
		fail("Not yet implemented");
	}
	@Test
	public void testSillyCustomer() {
		Shopping sh = new Shopping();
		ShoppingCart shoppingCart = sh.getShoppingCart();
		shoppingCart.addItem("Peach", 3);
		sh.checkOut();
	}

	@Test
	public void testSmartCustomer() {
		Shopping sh = new Shopping();
		ShoppingCart shoppingCart = sh.getShoppingCart();
		shoppingCart.addItem("Peach", 4);
		sh.checkOut();
	}

	@Test
	public void testThreeItemSmart() {
		Shopping sh = new Shopping();
		ShoppingCart shoppingCart = sh.getShoppingCart();
		shoppingCart.addItem("Peach", 4);
		shoppingCart.addItem("Avocado", 1);
		shoppingCart.addItem("Mango", 3);
		sh.checkOut();
	}

	@Test
	public void testThreeItemSilly() {
		Shopping sh = new Shopping();
		ShoppingCart shoppingCart = sh.getShoppingCart();
		shoppingCart.addItem("Peach", 3);
		shoppingCart.addItem("Avocado", 1);
		shoppingCart.addItem("Mango", 3);
		sh.checkOut();

	}

	@Test
	public void testZero() {
		Shopping sh = new Shopping();
		ShoppingCart shoppingCart = sh.getShoppingCart();
		shoppingCart.addItem("Peach", 0);
		shoppingCart.addItem("Avocado", 0);
		shoppingCart.addItem("Mango", 0);
		sh.checkOut();

	}
}
