/**
 * 
 */
package com.ygu.cart;

/**
 * 
 * 
 * From Eugene for interview with Flooid
 * 
 * 
 * Coding Challenge Senior Software Engineer
 * 
 * Promotional Pricing Write an application that will calculate the total basket
 * cost for a mix of items.� The pricing logic should handle the following items
 * and pricing schemes:
 * 
 * Peaches are 75 cents each.� If you buy 4 or more the price drops to 50 cents each.�� 
 * Avocados are $2 and don�t go on sale. 
 * Mangos are $2 each but are currently on promotion as buy one get one free.
 * 
 * 
 * Write a program that can calculate the total basket cost of these items.� The
 * program inputs should be how many of each item was purchased.� Inputs can
 * come from user input, read from a file, passed as command-line arguments,
 * Unit Tests, etc.� You can be flexible here.� As long as the program can be
 * run and inputs can be changed. When you are happy with your program, upload
 * the project to GitHub and share the link with Flooid at least 2 hours before
 * your interview is scheduled to begin.
 * 
 * 
 * 2/5/2021 Yansong Gu ygu95at@gmail.com
 * 
 * 
 */
public class Shopping {

	private ShoppingCart shoppingCart;

	public Shopping() {
		shoppingCart = new ShoppingCart();
	}

	public ShoppingCart getShoppingCart() {

		return shoppingCart;
	}

	public static void main(String[] args) {

		Shopping shopping = new Shopping();
		ShoppingCart shoppingCart = shopping.getShoppingCart();
		shoppingCart.addItem("Peach", 4);
		shoppingCart.addItem("Avocado", 1);
		shoppingCart.addItem("Mango", 3);

		shopping.checkOut();

	}

	public void checkOut() {
		if (this.shoppingCart.isEmpty()) {

			System.out.println(" nothing to pay! ");

		} else {

			CashRegister.CalculateTotalPrice(shoppingCart);

		}

	}

}
