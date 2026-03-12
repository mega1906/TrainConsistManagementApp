package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;

/*
 * Use Case 19: Binary Search for Bogie ID (Optimized Searching)
 * 
 * Description:
 * This class demonstrates searching for a specific bogie ID using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author Developer
 * @version 19.0
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
	static class Bogie { 
		String name;  
		int capacity;  

		Bogie(String name, int capacity) { 
			this.name = name;
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return name + " -> " + capacity;
		}
	}

	//Goods Bogie model
	static class GoodsBogie { 
		String type;   
		String cargo;  

		GoodsBogie(String type) { this.type = type; }

		GoodsBogie(String type, String cargo) { 
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
		System.out.println(" UC19 - Binary Search for Bogie ID ");
		System.out.println("================================================\n");

		// Create sorted array of bogie IDs
		String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

		// Ensure data is sorted before binary search (precondition)
		Arrays.sort(bogieIds);

		// Search key
		String key = "BG309";

		// Display available bogie IDs
		System.out.println("Sorted Bogie IDs:");
		for (String id : bogieIds) {
			System.out.println(id);
		}
		System.out.println();

		// Binary Search Logic
		int low = 0;
		int high = bogieIds.length - 1;
		boolean found = false;

		while (low <= high) {
			int mid = low + (high - low) / 2;          // safe mid calculation
			int cmp = key.compareTo(bogieIds[mid]);    // lexicographic comparison

			if (cmp == 0) {        // key equals middle element
				found = true;
				break;
			} 
			else if (cmp > 0) {  // key is greater -> search right half
				low = mid + 1;
			} 
			else {               // key is smaller -> search left half
				high = mid - 1;
			}
		}

		// Display result
		if (found) {
			System.out.println("Bogie " + key + " found using Binary Search.");
		} 
		else {
			System.out.println("Bogie " + key + " not found using Binary Search.");
		}
		System.out.println();

		System.out.println("UC19 search completed...");
	}
}