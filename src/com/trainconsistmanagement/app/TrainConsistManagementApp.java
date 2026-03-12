package com.trainconsistmanagement.app;

import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * This class compares execution time of loop-based filtering
 * versus stream-based filtering using System.nanoTime().
 *
 * At this stage, the application:
 * - Creates bogie test dataset
 * - Measures loop execution time
 * - Measures stream execution time
 * - Calculates elapsed duration
 * - Displays performance results
 *
 * This maps performance benchmarking using high-resolution timing.
 *
 * @author Developer
 * @version 13.0
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
		System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
		System.out.println("================================================\n");

		// Create large test dataset
		List<Bogie> bogies = new ArrayList<>();
		String[] types = {"Open", "Box", "Cylindrical", "Flat"};
		Random rnd = new Random(42);
		final int N = 200_000; // adjust higher/lower to see bigger/smaller timings

		for (int i = 0; i < N; i++) {
			String t = types[rnd.nextInt(types.length)];
			int cap = 30 + rnd.nextInt(100); // 30..129
			bogies.add(new Bogie(t, cap));
		}

		// Loop based filtering
		long startLoop = System.nanoTime();
		List<Bogie> loopFiltered = new ArrayList<>();
		for (Bogie b : bogies) {
			if (b.capacity > 60) {
				loopFiltered.add(b);
			}
		}
		long endLoop = System.nanoTime();
		long loopTime = endLoop - startLoop;

		// Stream based filtering
		long startStream = System.nanoTime();
		List<Bogie> streamFiltered = bogies.stream().filter(b -> b.capacity > 60).collect(Collectors.toList());
		long endStream = System.nanoTime();
		long streamTime = endStream - startStream;

		// Use results to avoid dead-code elimination (counts not printed in snapshot)
		if (loopFiltered.size() != streamFiltered.size()) {
			throw new AssertionError("Mismatch between loop and stream results!");
		}

		// Display timings
		System.out.println("Loop Execution Time (ns): " + loopTime);
		System.out.println("Stream Execution Time (ns): " + streamTime);
		System.out.println();
		
		System.out.println("UC13 performance benchmarking completed...");
	}
}