package org.tcudjoe.module_1_java_core.assignment_01_collections;

import org.tcudjoe.module_1_java_core.assignment_01_collections.assignments.A_ListBasics;
import org.tcudjoe.module_1_java_core.assignment_01_collections.assignments.B_SetBasics;

import java.util.ArrayList;
import java.util.List;

public class Main {


	public static void main(String[] args) throws Exception {
		/**
		 * Assignment A
		 */
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

		// Sort names alphabetically
		listBasics.sortListAlphabetically();

		/**
		 * Assignment B
		 */
		B_SetBasics setBasics = new B_SetBasics();

		//Add id to list
		setBasics.addIdToList(3);
		setBasics.addIdToList(12);
		setBasics.addIdToList(8);
		setBasics.addIdToList(9);
		setBasics.addIdToList(7);
		setBasics.addIdToList(0);
		setBasics.addIdToList(16);
		setBasics.addIdToList(1200);
		setBasics.addIdToList(-10);
		setBasics.addIdToList(1599);
		setBasics.addIdToList(302660);

		//Convert list to set
		List<Integer> listToConvert = new ArrayList<>();

		listToConvert.add(10);
		listToConvert.add(100);
		listToConvert.add(17);
		listToConvert.add(1);
		listToConvert.add(84);
		listToConvert.add(10);
		listToConvert.add(5);
		listToConvert.add(97);
		listToConvert.add(7);

		setBasics.convertListToSet(listToConvert);
	}
}
