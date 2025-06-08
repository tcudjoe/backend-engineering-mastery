package org.tcudjoe.module_1_java_core.assignment_01_collections;

import org.tcudjoe.module_1_java_core.assignment_01_collections.assignments.A_ListBasics;

public class Main {


	public static void main(String[] args) throws Exception {
		A_ListBasics listBasics = new A_ListBasics();

		// Add names
		listBasics.addNameToList("Tyra");
		listBasics.addNameToList("Junior");
		listBasics.addNameToList("David");
		listBasics.addNameToList("Micheal");
		listBasics.addNameToList("Emmanuel");
		listBasics.addNameToList("Ini");
		listBasics.addNameToList("Teddy");
		listBasics.addNameToList("Azariah");
		listBasics.addNameToList("Eurien");
		listBasics.addNameToList("Cody");
		listBasics.addNameToList("Ira");

		// Get names
		listBasics.getListOfAllNames();
		listBasics.getNameByIndex(4);

		// Set name
		listBasics.setName(6, "Anais");

		// Remove names
		listBasics.removeNameByIndex(1);
		listBasics.removeNameByName("ira");

		listBasics.sortListAlphabetically();
	}
}
