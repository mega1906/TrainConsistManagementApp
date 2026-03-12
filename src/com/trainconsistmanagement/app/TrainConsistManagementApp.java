package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 */

public class TrainConsistManagementApp {
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

	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		Scanner scanner = new Scanner(System.in);

		// Accept input
		System.out.print("Enter Train ID (Format: TRN-1234): ");
		String trainId = scanner.nextLine();

		System.out.print("Enter Cargo Code (Format: PET-AB): ");
		String cargoCode = scanner.nextLine();

		// Define regex rules
		String trainIdRegex = "TRN-\\d{4}";
		String cargoCodeRegex = "PET-[A-Z]{2}";

		Pattern trainPattern = Pattern.compile(trainIdRegex);
		Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

		Matcher trainMatcher = trainPattern.matcher(trainId);
		Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

		boolean isTrainValid = trainMatcher.matches();
		boolean isCargoValid = cargoMatcher.matches();

		System.out.println("\nValidation Results:");
		System.out.println("Train ID Valid: " + isTrainValid);
		System.out.println("Cargo Code Valid: " + isCargoValid);
		System.out.println("\nUC11 validation completed...");
	}
}