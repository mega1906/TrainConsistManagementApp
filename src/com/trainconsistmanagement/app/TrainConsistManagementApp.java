package com.trainconsistmanagement.app;

import java.util.*;

/*
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 * 
 * Main Class
 * 
 * Description:
 * This class ensures that duplicate bogie IDs are not added into the train formation using HashSet
 * 
 * At this stage, the application:
 * - Store bogie IDs 
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 * 
 * This maps uniqueness validation using Set
 * 
 * @author Developer
 * @version 3.0
 *
 */
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		// Create a Set to store unique bogie IDs
		// HashSet stores only unique values
		Set<String> bogies = new HashSet<>();

		// ADD IDs (including duplicates)
		// add() inserts bogie IDs into the set
		bogies.add("BG101");
		bogies.add("BG102");
		bogies.add("BG103");
		bogies.add("BG104");

		// Duplicate entries will be ignored internally by HashSet
		// Duplicate entries
		bogies.add("BG101"); 
		bogies.add("BG102"); 

		// Display unique bogie identifiers
		System.out.println("Bogie IDs After Insertion:");
		System.out.println(bogies + "\n");

		System.out.println("Note:");
		System.out.println("Duplicates are automatically ignored by HashSet.\n");

		System.out.println("UC3 uniqueness validation completed...");
	}
}