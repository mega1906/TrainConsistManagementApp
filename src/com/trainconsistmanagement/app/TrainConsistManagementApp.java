package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

/*
 * Use Case 8: Filter Passenger Bogies Using Streams
 * 
 * Main Class
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Applies filter condition
 * - Collects filtered result
 * - Displays qualifying bogies
 *
 * This maps functional filtering using Streams.
 *
 * @author Developer
 * @version 8.0
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


		// Create list of passenger bogies (same style as UC7)
		List<Bogie> bogies = new ArrayList<>();

		// Add bogies
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("AC Chair", 56));
		bogies.add(new Bogie("First Class", 24));
		bogies.add(new Bogie("General", 90));

		// Display all bogies
		System.out.println("All Bogies:");
		bogies.forEach(b -> System.out.println(b));
		System.out.println();

		// Filter bogies with capacity > 60 using Streams
		List<Bogie> filtered = bogies.stream()
				.filter(b -> b.capacity > 60)
				.collect(Collectors.toList());

		// Display filtered bogies
		System.out.println("Filtered Bogies (Capacity > 60):");
		filtered.forEach(b -> System.out.println(b));
		System.out.println();

		// Filter bogies with capacity > 40 using Streams
		List<Bogie> filtered1 = bogies.stream()
				.filter(b -> b.capacity > 40)
				.collect(Collectors.toList());

		// Display filtered bogies
		System.out.println("Filtered Bogies (Capacity > 40):");
		filtered1.forEach(b -> System.out.println(b));
		System.out.println();
		System.out.println("UC8 filtering completed...");
	}
}