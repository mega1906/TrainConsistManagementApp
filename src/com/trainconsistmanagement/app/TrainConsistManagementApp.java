package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

/*
 * Use Case 10: Count Total Seats in Train (reduce)
 *
 * Description:
 * This class aggregates seating capacity of all bogies into a single total using Stream.reduce()
 *
 * At this stage, the application:
 * - Creates bogie list
 * - Maps bogies to its capacity
 * - Reduces values into total
 * - Displays total seat count (capacity)
 *
 * This maps aggregation logic using reduce().
 *
 * @author Developer
 * @version 10.0
 */


public class TrainConsistManagementApp {
	// Inner Bogie class to model passenger bogies
	static class Bogie { // 8 usages
		String name;   // 3 usages
		int capacity;  // 4 usages

		Bogie(String name, int capacity) { // 4 usages
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


		// Create list of bogies
		List<Bogie> bogies = new ArrayList<>();

		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("AC Chair", 56));
		bogies.add(new Bogie("First Class", 24));
		bogies.add(new Bogie("Sleeper", 70));
		bogies.add(new Bogie("AC Chair", 60));

		// Display input bogies
		System.out.println("All Bogies:");
		for (Bogie b : bogies) {
			System.out.println(b);
		}
		System.out.println();

		// Aggregate using reduce
		// map() extracts capacity field from Bogie object
		int totalCapacity = bogies.stream().map(b -> b.capacity).reduce(0, Integer::sum);

		System.out.println("Total Seating Capacity of Train: " + totalCapacity + "\n");

		System.out.println("UC10 aggregation completed...");
	}

}