package com.trainconsistmanagement.app;

import java.util.*;

/*
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * 
 * Main Class
 * 
 * This class maintains the exact attachment order of bogies while also preventing duplicate entries using LinkedHashSet.
 * 
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 * 
 * This maps ordered uniqueness using LinkedHashSet.
 * 
 * @author Developer
 * @version 5.0
 *
 */
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		// LinkedHashSet preserves order and ensures uniqueness
		Set<String> formation = new LinkedHashSet<>();

		// Attach bogies in order
		formation.add("Engine");
		formation.add("Sleeper");
		formation.add("Cargo");
		formation.add("Guard");

		// Attempt to attach a duplicate bogie intentionally
		// The system should ignore this to protect the train consist
		formation.add("Sleeper");

		// Display final train formation
		System.out.println("Final Train Formation:");
		System.out.println(formation + "\n");

		System.out.println("Note:");
		System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

		System.out.println("UC5 formation setup completed...");
	}
}