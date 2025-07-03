package org.tcudjoe.module_1_java_core.assignment_01_collections.assignments;

import java.util.HashMap;

/**
 * Play With Maps
 * <p>
 * - Create a `HashMap<String, Integer>` for product prices
 * - Retrieve, update, and remove items
 * - Loop through `entrySet()` and print key-values
 * - Replace with a `TreeMap` and sort keys alphabetically
 */
public class C_MapBasics {
	HashMap<String, Integer> products = new HashMap<>();

	public void addToHashMap(String productName, Integer productPrice) {
		products.put(productName, productPrice);
		System.out.println("Added product with price: " + products);
	}
}
