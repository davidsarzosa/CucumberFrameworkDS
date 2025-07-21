package com.neotech.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {

		List<Map<String, String>> listOfMaps = new ArrayList<>();

		Map<String, String> user1 = new HashMap<>();
		user1.put("FirstName", "Anna");
		user1.put("LastName", "Thruman");

		listOfMaps.add(user1);
		
		Map<String, String> user2 = new HashMap<>();
		user2.put("FirstName", "Faraaz");
		user2.put("LastName", "Mo");	
		
		
		listOfMaps.add(user2);

		System.out.println(listOfMaps);
		
		for (Map<String, String> user : listOfMaps) {
			System.out.println(user.get("FirstName"));
			System.out.println(user.get("LastName"));
			

		}

	}

}
