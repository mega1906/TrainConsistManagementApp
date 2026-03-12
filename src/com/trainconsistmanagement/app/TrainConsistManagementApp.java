package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;

/*
 * Use Case 20: Exception Handling During Search Operations
 * 
 * Description:
 * This class prevents searching when no bogies exist by applying fail-fast validation using exceptions.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 *
 * This maps defensive programming using runtime exceptions.
 *
 * @author Developer
 * @version 20.0
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
		System.out.println(" UC20 - Exception Handling During Search ");
		System.out.println("================================================\n");

		// Create bogie array (empty train scenario)
		String[] bogieIds = {};

		// Search key
		String searchId = "BG101";

		// Fail Fast Validation
		// Check if train has bogies before performing search
		if (bogieIds.length == 0) {
			throw new IllegalStateException("No bogies available in train. Cannot perform search.");
		}

		// Search logic - executes only if data exists
		boolean found = false;

		for (String id : bogieIds) {
			if (id.equals(searchId)) {
				found = true;
				break;
			}
		}

		
		// Display result
		if (found) {
			System.out.println("Bogie " + searchId + " found.");
		} 
		else {
			System.out.println("Bogie " + searchId + " not found.");
		}
		System.out.println();

		System.out.println("UC20 execution completed...");
	}
}