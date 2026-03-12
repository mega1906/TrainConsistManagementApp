package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

/*
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 * 
 * Main Class
 *
 * Description:
 * This class groups similar bogies together using Java Stream Collectors.groupingBy().
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Streams the list
 * - Groups bogies by name
 * - Stores grouped data in a Map
 * - Displays grouped structure
 *
 * This maps classification logic using groupingBy.
 *
 * @author Developer
 * @version 9.0
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

		        // Group using Collectors.groupingby
		        Map<String, List<Bogie>> groupedBogies =
		                bogies.stream()
		                        .collect(Collectors.groupingBy(b -> b.name));

		        // Display grouped structure
		        System.out.println("Grouped Bogies:\n");

		        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
		            System.out.println("Bogie Type: " + entry.getKey());
		            for (Bogie b : entry.getValue()) {
		                System.out.println("  Capacity -> " + b.capacity);
		            }
		            System.out.println();
		        }

		        System.out.println("UC9 grouping completed...");
		    }
}