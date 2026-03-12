package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies while handling unsafe combinations using structured exception handling blocks.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 *
 * This maps runtime safety handling using try-catch-finally.
 *
 * @author Developer
 * @version 15.0
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
		System.out.println(" UC15 - Safe Cargo Assignment ");
		System.out.println("================================================\n");

		// 1) Safe case: Cylindrical bogie with Petroleum
		GoodsBogie cyl = new GoodsBogie("Cylindrical");
		cyl.assignCargo("Petroleum");
		System.out.println();

		// 2) Unsafe case: Rectangular bogie with Petroleum
		GoodsBogie rect = new GoodsBogie("Rectangular");
		rect.assignCargo("Petroleum");
		System.out.println();

		System.out.println("UC15 runtime handling completed...");
	}

}