package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;

/*
 * Use Case 18: Linear Search for Bogie ID (Array-Based Searching)
 * 
 * Description:
 * This class demonstrates searching for a specific bogie ID using a simple Linear Search algorithm.
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverse array sequentially 
 * - Stops when match is found
 * - Displays search results
 *
 * This maps basic searching logic using sequential traversal
 *
 * @author Developer
 * @version 18.0
 */

public class TrainConsistManagementApp {
	// Custom Exception
	static class InvalidCapacityException extends Exception {
		public InvalidCapacityException(String message) { super(message); }
	}

	// Custom runtime exception
	static class CargoSafetyException extends RuntimeException {
		public CargoSafetyException(String message) { super(message); }
	}


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

	//Goods Bogie model
	static class GoodsBogie { // 6 usages
		String type;   // 3 usages
		String cargo;  // 3 usages

		GoodsBogie(String type) { this.type = type; }

		GoodsBogie(String type, String cargo) { // 4 usages
			this.type = type;
			this.cargo = cargo;
		}

		@Override
		public String toString() {
			return type + " -> " + cargo;
		}

		// Assign cargo with safety validation
		void assignCargo(String cargo) {
			try {
				// Rule: Rectangular bogie cannot carry petroleum
				if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
					throw new CargoSafetyException("Unsafe cargo assignment!");
				}

				// Safe assignment
				this.cargo = cargo;
				System.out.println("Cargo assigned successfully -> " + cargo);

			} 
			catch (CargoSafetyException e) {
				System.out.println("Error: " + e.getMessage());
			} 
			finally {
				System.out.println("Cargo validation completed for " + type + " bogie");
			}
		}

	}

	// Passenger Bogie model with validation
	static class PassengerBogie {
		String name;
		int capacity;

		public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
			if (capacity <= 0) {
				throw new InvalidCapacityException("Capacity must be greater than zero");
			}
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

		System.out.println("================================================");
		System.out.println(" UC18 - Linear Search for Bogie ID ");
		System.out.println("================================================\n");

		// Create array of bogie IDs
		String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

		// Bogie ID to search
		String searchId1 = "BG308";
		String searchId2 = "BG309";

		// Display all bogies
		System.out.println("Available Bogie IDs:");
		for (String id : bogieIds) {
			System.out.println(id);
		}
		System.out.println();

		// Linear Search Logic
		// Traverse each element sequentially
		boolean found1 = false;
		for (String id : bogieIds) {
			if (id.equals(searchId1)) {   // Equality comparison using equals()
				found1 = true;            // Set flag when match is found
				break;                   // Early termination
			}
		}

		// Display result
		if (found1) {
			System.out.println("Bogie " + searchId1 + " found in train consist.");
		} 
		else {
			System.out.println("Bogie " + searchId1 + " not found in train consist.");
		}
		System.out.println();
		
		boolean found2 = false;
		for (String id : bogieIds) {
			if (id.equals(searchId2)) {   // Equality comparison using equals()
				found2 = true;            // Set flag when match is found
				break;                   // Early termination
			}
		}

		// Display result
		if (found2) {
			System.out.println("Bogie " + searchId2 + " found in train consist.");
		} 
		else {
			System.out.println("Bogie " + searchId2 + " not found in train consist.");
		}
		System.out.println();
		
		System.out.println("UC18 search completed...");
	}
}