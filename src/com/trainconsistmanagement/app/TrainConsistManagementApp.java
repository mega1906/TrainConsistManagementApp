package com.trainconsistmanagement.app;

import java.util.*;

/*
 * Use Case 1: Initialize train and Display Consist Summary
 * 
 * Main Class
 * 
 * Description:
 * This class represents the entry point of the Train Consist Management Application
 * 
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic list to store bogies 
 * - Displays initial bogie count
 * - Prints the current state of the train
 * 
 * This use case introduces collection initialization and basic program startup flow
 * 
 * @author Developer
 * @version 1.0
 *
 */
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		// Create a dynamic list to store train bogies
		// Using List<String> as shown in the code snapshot
		List<String> trainConsist = new ArrayList<>();

		// Display initial consist information
		System.out.println("Train initialized successfully...");

		// Display the initial bogie count using size()
		// Requirements: The initial bogie count is displayed
		System.out.println("Initial Bogie Count: " + trainConsist.size());

		// Prints the current state of the train
		System.out.println("Current Train State: " + trainConsist);

		System.out.println("\nSystem ready for operations...");
	}
}