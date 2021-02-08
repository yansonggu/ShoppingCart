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
	public void testSillyCustomer() {
		Shopping sh1 = new Shopping();
		ShoppingCart shoppingCart = sh1.getShoppingCart();
		shoppingCart.addItem("Peach", 3);
		sh1.checkOut();
		assertEquals("2.25", String.valueOf(sh1.whatIsTheTotal()));
	}

	@Test
	public void testSmartCustomer() {
		Shopping sh2 = new Shopping();
		ShoppingCart shoppingCart = sh2.getShoppingCart();
		shoppingCart.addItem("Peach", 4);
		sh2.checkOut();
		assertEquals("2.0", String.valueOf(sh2.whatIsTheTotal()));
	}

	@Test
	public void testThreeItemSmart() {
		Shopping sh3 = new Shopping();
		ShoppingCart shoppingCart = sh3.getShoppingCart();
		shoppingCart.addItem("Peach", 4);
		shoppingCart.addItem("Avocado", 1);
		shoppingCart.addItem("Mango", 3);
		sh3.checkOut();
		assertEquals("8.0", String.valueOf(sh3.whatIsTheTotal()));
	}

	@Test
	public void testThreeItemSilly() {
		Shopping sh4 = new Shopping();
		ShoppingCart shoppingCart = sh4.getShoppingCart();
		shoppingCart.addItem("Peach", 3);
		shoppingCart.addItem("Avocado", 1);
		shoppingCart.addItem("Mango", 3);
		sh4.checkOut();
		assertEquals("8.25", String.valueOf(sh4.whatIsTheTotal()));

	}

	@Test
	public void testZero() {
		Shopping sh = new Shopping();
		ShoppingCart shoppingCart = sh.getShoppingCart();
		shoppingCart.addItem("Peach", 0);
		shoppingCart.addItem("Avocado", 0);
		shoppingCart.addItem("Mango", 0);
		sh.checkOut();
		assertEquals("0.0", String.valueOf(sh.whatIsTheTotal()));
	}
	
	@Test
	public void testOneRegularItem() {
		Shopping sh4 = new Shopping();
		ShoppingCart shoppingCart = sh4.getShoppingCart(); 
		shoppingCart.addItem("Avocado", 1); 
		sh4.checkOut();
		assertEquals("2.0", String.valueOf(sh4.whatIsTheTotal()));

	}
}
