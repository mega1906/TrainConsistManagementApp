package com.trainconsistmanagement.app;

import java.util.*;

/*
 * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
 * 
 * Main Class
 * 
 * Description:
 * This class represents how passenger bogies can be managed dynamically using ArrayList operations
 * 
 * At this stage, the application:
 * - Adds new bogies to the train 
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 * 
 * This maps CRUD operations using ArrayList
 * 
 * @author Developer
 * @version 2.0
 *
 */
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		// Create an ArrayList to hold passenger bogies
		List<String> passengerBogies = new ArrayList<>();

		// CREATE 
		// add() attaches a new bogie to the train
		passengerBogies.add("Sleeper");
		passengerBogies.add("AC Chair");
		passengerBogies.add("First Class");

		// Display list after insertion
		System.out.println("After Adding Bogies:");
		System.out.println("Passenger Bogies : " + passengerBogies + "\n");

		// DELETE
		// Removing 'AC Chair' as per requirement
		passengerBogies.remove("AC Chair");
		System.out.println("After Removing 'AC Chair':");
		System.out.println("Passenger Bogies : " + passengerBogies + "\n");

		// READ
		// Use contains() to check if 'Sleeper' exists
		System.out.println("Checking if 'Sleeper' exists:");
		boolean hasSleeper = passengerBogies.contains("Sleeper");
		System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

		// Display final consist state
		System.out.println("Final Train Passenger Consist:");
		System.out.println(passengerBogies + "\n");

		System.out.println("UC2 operations completed successfully...");
	}
}