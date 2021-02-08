package com.ygu.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	Map<String, Integer> BucketItems = new HashMap<String, Integer>();

	public void addItem(String itemName) {
		if (BucketItems.containsKey(itemName)) {
			BucketItems.put(itemName, BucketItems.get(itemName) + 1);
		} else {
			BucketItems.put(itemName, 1);
		}
	}

	public void addItem(String itemName, int i) {
		if (BucketItems.containsKey(itemName)) {
			BucketItems.put(itemName, BucketItems.get(itemName) + i);
		} else {
			BucketItems.put(itemName, i);
		}
	}

	public boolean isEmpty() {

		if (BucketItems.isEmpty())
			return true;
		return false;
	}

}
