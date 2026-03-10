package com.trainconsistmanagement.app;

import java.util.*;

/*
 * Use Case 6: Map Bogie to Capacity (HashMap)
 * 
 * Main Class
 * 
 * Description: 
 * This class associates each bogie with its seating or load capacity using a key-value mapping structure.
 * 
 *  The application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 * 
 * This maps lookup-based access using HashMap.
 * 
 * @author Developer
 * @version 6.0
 *
 */
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		// HashMap stores data in key -> value format
		// Key: Bogie Name (String), Value: Capacity (Integer)
		Map<String, Integer> capacityMap = new HashMap<>();

		// ---- Insert bogie capacities ----
		// put() binds the key (Bogie) to the value (Capacity)
		capacityMap.put("Sleeper", 72);
		capacityMap.put("AC Chair", 56);
		capacityMap.put("First Class", 24);
		capacityMap.put("Cargo", 120);

		System.out.println("Bogie Capacity Details:");

		// Iterate through the map using entrySet()
		// This allows us to access both the key and the value efficiently
		for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("\nUC6 bogie-capacity mapping completed...");
	}
}