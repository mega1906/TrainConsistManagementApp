package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * This maps real-world cargo safety rules using Streams.
 *
 * @author Developer
 * @version 12.0

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

	//Goods Bogie model
    static class GoodsBogie { // 6 usages
        String type;   // 3 usages
        String cargo;  // 3 usages

        GoodsBogie(String type, String cargo) { // 4 usages
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");
		
        System.out.println("================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("================================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid by rule

        // Display input bogies
        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(b -> System.out.println(b));
        System.out.println();

        // Safety rule with streams
        // Rule: If type is Cylindrical, cargo MUST be Petroleum.
        boolean isSafe = goodsBogies.stream().allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum"));

        // Display result
        System.out.println("Safety Compliance Status: " + isSafe);
        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } 
        else {
            System.out.println("Train formation is NOT SAFE.");
        }
        System.out.println();
        
        System.out.println("UC12 safety validation completed...");
    }
}