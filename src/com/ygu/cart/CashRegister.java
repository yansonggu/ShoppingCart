package com.ygu.cart;

import java.util.HashMap;

public class CashRegister {
	private static double totalPrice = 0;

	public static void CalculateTotalPrice(ShoppingCart shoppingCart) {

		double temp = 0;
		ItemFullSpecification item;
		int price;
		StockPileStoreItems si = new StockPileStoreItems();
		HashMap<String, Double> pricelist = new HashMap<String, Double>();
		for (String itemName : shoppingCart.BucketItems.keySet()) {

			int count = shoppingCart.BucketItems.get(itemName);
			ItemFullSpecification bucketItem = si.getItem(itemName);
  
			if (bucketItem.isSale()
					&& bucketItem.getSaleType().equals("buy 4 or more the price drops to 50 cents each")) {
				if (count > 3) {
					totalPrice = 0.5 * count ;
					pricelist.put(bucketItem.getItemName(), totalPrice);
					System.out.println(count + " Peaches  total cost: " + totalPrice);
				} else {
					totalPrice =0.75 * count;
					pricelist.put(bucketItem.getItemName(), totalPrice);
					System.out.println(count + " Peaches  total cost: " + totalPrice);
				} 
			}

			if (bucketItem.isSale() && bucketItem.getSaleType().equals("buy one get one free")) {

				if (count > 1) {
					totalPrice = bucketItem.getItemPrice() * (count / 2 + count % 2);
					pricelist.put(bucketItem.getItemName(), totalPrice);
					System.out.println(count + " Mangos  total cost: " + totalPrice);
				} else {
					totalPrice = bucketItem.getItemPrice() * count;
					pricelist.put(bucketItem.getItemName(), totalPrice);
					System.out.println(count + " Mangos total cost: " + totalPrice);
				}

			}

			if (!bucketItem.isSale()) {
				totalPrice = bucketItem.getItemPrice() * count;
				pricelist.put(bucketItem.getItemName(), totalPrice);
				System.out.println(count + " Avocado total cost: " + totalPrice);
			}

		}
		totalPrice = 0;
		for (String name : pricelist.keySet()) {
			totalPrice += pricelist.get(name);
		}
		System.out.println("\n-----------Your total cost: " + totalPrice);
	}

}
