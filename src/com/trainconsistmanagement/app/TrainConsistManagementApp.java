package com.trainconsistmanagement.app;

import java.util.*;

/*
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 * 
 * Main Class
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a List
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator.
 *
 * @author Developer
 * @version 7.0
 */
public class TrainConsistManagementApp {
	// Inner Bogie class to model passenger bogies
	static class Bogie {
		String name;   // 3 usages
		int capacity;  // 4 usages

		Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return name + " -> " + capacity;
		}
	}

	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");
		// Create List of passenger bogies
		List<Bogie> bogies = new ArrayList<>();

		// Add bogies
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("AC Chair", 56));
		bogies.add(new Bogie("First Class", 24));
		bogies.add(new Bogie("General", 90));

		// Display before sorting
		System.out.println("Before Sorting:");
		for (Bogie b : bogies) {
			System.out.println(b);
		}
		System.out.println();

		// Apply Comparator to sort by capacity (ascending)
		bogies.sort(Comparator.comparingInt(b -> b.capacity));

		// Display after sorting
		System.out.println("After Sorting by Capacity:");
		for (Bogie b : bogies) {
			System.out.println(b);
		}
		System.out.println();

		System.out.println("UC7 sorting completed...");
	}

}