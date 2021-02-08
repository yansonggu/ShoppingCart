package com.ygu.cart;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockPileStoreItems {

	private static HashMap<String, ItemFullSpecification> storeItems = new HashMap<String, ItemFullSpecification>();

	StockPileStoreItems() {
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader("items.json")) {

			Object obj = jsonParser.parse(reader);
			JSONArray itemsList = (JSONArray) obj;
			itemsList.forEach(items -> parseitemObject((JSONObject) items));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	void parseitemObject(JSONObject item) {
		ItemFullSpecification newItem = new ItemFullSpecification();

		JSONObject itemObject = (JSONObject) item.get("items");
		
		String itemName = (String) itemObject.get("itemName");
		newItem.setItemName(itemName);
		double price =  (double) itemObject.get("price");
		newItem.setItemPrice( price );

		boolean sale = (boolean) itemObject.get("sale");
		newItem.setSale(sale);
		
		if (sale) { 
			String saleType = (String) itemObject.get("saleType");
			newItem.setSaleType(saleType);
			long condition = (long) itemObject.get("condition");
			newItem.setCondition( condition );
			double discount = (double) itemObject.get("discount");
			newItem.setDiscount(discount );

		}   
		storeItems.put(itemName, newItem);
	}

	public static ItemFullSpecification getItem(String itemName) {

		ItemFullSpecification item = new ItemFullSpecification();
		for (String x : storeItems.keySet()) {
			String y = (String) storeItems.get(x).getItemName();
			if (itemName.equalsIgnoreCase(y)) {
				item.setItemName(itemName);
				item.setItemPrice(storeItems.get(x).getItemPrice());
				item.setSale(storeItems.get(x).isSale());
				if (item.isSale()) {
					item.setCondition((long) storeItems.get(x).getCondition());
					item.setDiscount((double)storeItems.get(x).getDiscount());
					item.setSaleType(storeItems.get(x).getSaleType());
				}
				break;
			}
		}

		return item;
	}

}
