package org.tcudjoe.module_1_java_core.assignment_01_collections.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create & Manipulate Lists
 * <p>
 * - Create an `ArrayList<String>` of names
 * - Add, remove, get, and set elements
 * - Iterate using `for`, `for-each`, `iterator`
 * - Sort the list alphabetically
 */
public class A_ListBasics {

	List<String> listOfNames = new ArrayList<>();

	public void addNameToList(String name) throws Exception {

		if (name != null && !name.isEmpty()) {
			try {
				listOfNames.add(name);
				System.out.println("Name added to list: " + name);
			} catch (NullPointerException nexc) {
				throw new NullPointerException();
			} catch (Exception exc) {
				throw new Exception("An exception occured while trying to add a name to the list: ", exc);
			}
		}
	}

	public List<String> getListOfAllNames() {
		if (listOfNames.isEmpty()) {
			System.out.println("List of names is empty");
			return Collections.emptyList();
		} else {
			System.out.println("Full list of names: " + listOfNames);
		}

		return listOfNames;
	}

	public String getNameByIndex(int index) {
		String name = listOfNames.get(index);

		if (index >= 0 && index < listOfNames.size()) {

			System.out.println("Name: " + name + ", at index: " + index + ", returned.");
			return name;
		} else {

			System.out.println("Index does not exist.");
		}

		return name;
	}

	public void setName(int index, String name) {
		if (index >= 0 && index < listOfNames.size()) {
			listOfNames.set(index, name);

			System.out.println("Name of index: " + index + ", replaced with: " + name);
			System.out.println("Full list of names with replaced name: " + listOfNames);
		} else {

			System.out.println("Index does not exist");
		}

	}

	public void removeNameByIndex(int index) {
		if (index >= 0 && index < listOfNames.size()) {
			listOfNames.remove(index);

			System.out.println("Name with index: " + index + " successfully removed.");
			System.out.println("Full list of names without deleted name: " + listOfNames);
		} else {

			System.out.println("Index does not exist.");
		}
	}

	public void removeNameByName(String nameToRemove) {
		for (String name : listOfNames) {
			if (name.equalsIgnoreCase(nameToRemove)) {

				listOfNames.remove(name);

				System.out.println(name + ", was successfully removed.");
				System.out.println("Full list of names without deleted name: " + listOfNames);

				break;
			} else {
				System.out.println("Name doesnt exist");
			}
		}
	}
}