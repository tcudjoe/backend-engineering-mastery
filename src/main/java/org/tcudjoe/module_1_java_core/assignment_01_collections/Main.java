package org.tcudjoe.module_1_java_core.assignment_01_collections;

import org.tcudjoe.module_1_java_core.assignment_01_collections.assignments.A_ListBasics;
import org.tcudjoe.module_1_java_core.assignment_01_collections.assignments.B_SetBasics;
import org.tcudjoe.module_1_java_core.assignment_01_collections.assignments.C_MapBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

		// Sort set with Treeset
		Set<Integer> setToSort = new HashSet<>();

		setToSort.add(5);
		setToSort.add(1);
		setToSort.add(1);
		setToSort.add(1000);
		setToSort.add(198);
		setToSort.add(7);
		setToSort.add(50);
		setToSort.add(8);
		setToSort.add(1);
		setToSort.add(978);
		setToSort.add(645);
		setToSort.add(312);
		setToSort.add(12);
		setToSort.add(3);

		setBasics.sortSetWithTreeSet(setToSort);

		// map basics
		C_MapBasics mapBasics = new C_MapBasics();

		mapBasics.addToHashMap("SHOES", 20);
		mapBasics.addToHashMap("SHIRTS", 20);
		mapBasics.addToHashMap("SHOES", 99);
		mapBasics.addToHashMap("TENNISRACKET", 80);
		mapBasics.addToHashMap("MOUSE", 2);
		mapBasics.addToHashMap("KEYBOARD", 10);
		mapBasics.addToHashMap("CAMERA", 2030);
	}
}
