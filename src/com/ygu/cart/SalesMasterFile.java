package com.ygu.cart;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SalesMasterFile {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		JSONObject itemDetails = new JSONObject();
		CreateSaleObject.createNoSaleObject(itemDetails,  "avocado", 2, false);
		JSONObject itemObject = new JSONObject();
		itemObject.put("items", itemDetails);

		JSONObject itemDetails2 = new JSONObject();
		CreateSaleObject.createSaleObject(itemDetails2, "peach", 0.75, true,"buy 4 or more the price drops to 50 cents each",4,0.5);
		JSONObject itemObject2 = new JSONObject();
		itemObject2.put("items", itemDetails2);

		JSONObject itemDetails3 = new JSONObject();
		CreateSaleObject.createSaleObject(itemDetails3, "mango",2, true, "buy one get one free", 2,0.5);
		JSONObject itemObject3 = new JSONObject();
		itemObject3.put("items", itemDetails3);

		JSONArray itemList = new JSONArray();
		itemList.add(itemObject);
		itemList.add(itemObject2);
		itemList.add(itemObject3);

		try (FileWriter file = new FileWriter("items.json")) {

			file.write(itemList.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}