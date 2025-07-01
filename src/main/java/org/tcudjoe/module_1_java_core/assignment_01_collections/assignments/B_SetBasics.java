package org.tcudjoe.module_1_java_core.assignment_01_collections.assignments;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Create & Use Sets
 * <p>
 * - Use `HashSet<Integer>` to store unique IDs
 * - Try adding duplicates and observe behavior
 * - Convert a `List` to a `Set` to remove duplicates
 * - Sort a `Set` using a `TreeSet`
 */
public class B_SetBasics {

	HashSet<Integer> listOfIds = new HashSet<>();

	public void addIdToList(int id) {
		if (id >= 0) {
			try {
				listOfIds.add(id);
				System.out.println("Id added: " + id);
			} catch (NumberFormatException nfexc) {
				nfexc.getMessage();
			}
		}
	}

	public Set<Integer> convertListToSet(List<Integer> listToConvert) {
		if (!listToConvert.isEmpty()) {
			try {
				System.out.println("list before converted to set: " + listToConvert);
				System.out.println("list after converted to set: " + listToConvert.stream().collect(Collectors.toSet()));

				return listToConvert.stream().collect(Collectors.toSet());
			} catch (NumberFormatException nfexc) {
				nfexc.getMessage();
			}
		}
		return new HashSet<>();
	}
}
