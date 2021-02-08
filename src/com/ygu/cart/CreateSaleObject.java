package com.ygu.cart;
import org.json.simple.JSONObject;

public class CreateSaleObject {
 
	public static void createSaleObject(JSONObject jsonObject,  String itemName, double price, boolean sale,  String saleType, long condition, double discount) {
		   jsonObject.put("itemName", itemName);
           jsonObject.put("price", price);
           jsonObject.put("sale", sale);
           jsonObject.put("saleType", saleType);
           jsonObject.put("condition", condition);
           jsonObject.put("discount", discount);  
	}
	
	public static void createNoSaleObject(JSONObject jsonObject,  String itemName,  double price, boolean sale) {
		  jsonObject.put("itemName", itemName);
          jsonObject.put("price", price);
          jsonObject.put("sale", sale);
          jsonObject.put("saleType", "");
          jsonObject.put("condition",(long)  0);
          jsonObject.put("discount", 0); 
          
		
	}
	
}
