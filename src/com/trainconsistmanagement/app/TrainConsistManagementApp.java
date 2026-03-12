package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)
 *
 * Description:
 * This class demonstrates manual sorting of passenger bogie capacities using the Bubble Sort algorithm instead of built-in sorting utilities.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * @author Developer
 * @version 16.0
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
		System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
		System.out.println("================================================\n");

		// Create array of passenger bogie capacities
		int[] capacities = {72, 56, 24, 70, 60, 42};

		// Display original order
		System.out.println("Original Capacities:");
		for (int c : capacities) {
			System.out.print(c + " ");
		}
		System.out.println();

		// Bubble Sort
		// Outer loop controls number of passes
		for (int i = 0; i < capacities.length - 1; i++) {

			// Inner loop compares adjacent elements
			for (int j = 0; j < capacities.length - 1 - i; j++) {

				// Swap if out of order
				if (capacities[j] > capacities[j + 1]) {
					int temp = capacities[j];
					capacities[j] = capacities[j + 1];
					capacities[j + 1] = temp;
				}
			}
		}

		// Display sorted result
		System.out.println("\nSorted Capacities (Ascending):");
		for (int c : capacities) {
			System.out.print(c + " ");
		}

		System.out.println("\n\nUC16 sorting completed...");
	}
}