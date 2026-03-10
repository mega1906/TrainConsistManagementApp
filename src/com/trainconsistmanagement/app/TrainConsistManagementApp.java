package com.trainconsistmanagement.app;

import java.util.*;

/*
 * Use Case 4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
 * 
 * Main Class
 * 
 * Description:
 * This class models the physical chaining of train bogies using LinkedList for ordered operations.
 * 
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 * 
 * @author Developer
 * @version 4.0
 *
 */
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		// Create a LinkedList
		// LinkedList maintains insertion order and allows fast inserts
		LinkedList<String> trainConsist = new LinkedList<>();

		// Add bogies in sequence
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");

		System.out.println("Initial Train Consist:");
		System.out.println(trainConsist + "\n");

		// Insert 'Pantry Car' at position 2
		// Lists are 0-indexed, so index 2 is the 3rd position
		trainConsist.add(2, "Pantry Car");
		System.out.println("After Inserting 'Pantry Car' at position 2:");
		System.out.println(trainConsist + "\n");

		// Remove First and Last Bogie
		// Modeling detaching the Engine and the Guard coach
		trainConsist.removeFirst();
		trainConsist.removeLast();

		System.out.println("After Removing First and Last Bogie:");
		System.out.println(trainConsist + "\n");

		System.out.println("UC4 ordered consist operations completed...");
	}
}