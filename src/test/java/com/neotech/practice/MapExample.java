package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	
	public static void main(String[] args) {
		Map<String, String > map = new LinkedHashMap<>();
		
		map.put("FirstName", "Anna");
		map.put("LastName", "Thurman");
		map.put("Position", "General Manager");
	
		
		System.out.println(map);
		
		System.out.println(map.get("FirstName"));
		System.out.println(map.get("Position"));	
		
		
		
	}
	
	
	
}
