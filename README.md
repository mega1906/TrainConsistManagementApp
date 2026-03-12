# TrainConsistManagementApp

### Use Case 1: Initialize Train and Display Consist Summary

A small Java console app that starts the Train Consist Management system.  
It sets up an empty train consist and prints basic startup information.

This application:
- Creates an empty dynamic list to store bogies  
- Shows the initial bogie count using `size()`  
- Prints the current state of the train  
- Confirms that the system is ready for further operations  

A simple starting point that introduces collection initialization and program setup flow.

### Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)

A small Java console app that shows how to manage passenger bogies using an `ArrayList`.  
It covers the basics of CRUD operations: adding, removing, checking, and displaying bogies.

This application:
- Adds new bogies (CREATE)  
- Removes a bogie (DELETE)  
- Checks if a bogie exists (READ)  
- Prints the final train consist

### Use Case 3: Track Unique Bogie IDs (HashSet)

A small Java console app that demonstrates how to store bogie IDs using a `HashSet`.  
It focuses on uniqueness handling—making sure no duplicate bogie IDs are added to the train consist.

This application:
- Stores bogie IDs in a `HashSet`
- Automatically ignores duplicate entries
- Displays the final list of unique bogie identifiers

Very useful for validating data where duplicates should not be allowed.

### Use Case 4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)

A small Java console app that shows how to maintain an ordered train consist using a `LinkedList`.  
It focuses on positional operations like inserting bogies at specific locations and removing them from the front or rear.

This application:
- Adds bogies in sequence (insertion order preserved)
- Inserts a bogie at a specific position
- Removes the first and last bogies
- Displays the updated train structure after each change

Useful for scenarios where the train order matters and frequent insert/remove operations are required.

### Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)

A small Java console app that shows how to maintain the attachment order of train bogies while still avoiding duplicates using a `LinkedHashSet`.  
It combines the benefits of ordering (like a list) with uniqueness (like a set).

This application:
- Attaches bogies in the exact order they are added
- Automatically ignores duplicate bogies
- Preserves insertion sequence
- Prints the final train formation

Great for cases where the order of bogie attachment matters but duplicates should never be allowed.

### Use Case 6: Map Bogie to Capacity (HashMap)

A small Java console app that shows how to store bogie capacities using a `HashMap`.  
Each bogie is mapped to its seating or load capacity using a simple key–value structure.

This application:
- Creates a `HashMap` to link bogies with their capacities  
- Inserts capacity values using `put()`  
- Iterates through map entries to display each bogie and its capacity  
- Demonstrates fast lookup-based access provided by HashMap

Great for scenarios where you need quick access to details based on a specific bogie name.

### Use Case 7: Sort Bogies by Capacity (Comparator)

A small Java console app that shows how to sort custom bogie objects using a `Comparator`.  
The program stores bogies with their seating capacities and then sorts them in ascending order.

This application:
- Creates bogie objects with name and capacity
- Stores them in a `List`
- Prints the bogies before sorting
- Applies a custom Comparator to sort by capacity
- Displays the sorted list

Useful for scenarios where you need custom ordering instead of default sorting behavior.

### Use Case 8: Filter Passenger Bogies Using Streams

A small Java console app that shows how to filter bogies using the Java Stream API.  
The program takes a list of bogies and extracts only those that meet a given capacity requirement.

This application:
- Creates a list of bogie objects
- Converts the list into a stream
- Applies a filter condition (capacity > 60 and capacity > 40)
- Collects the filtered results into a new list
- Displays bogies that satisfy the filter

A simple example of functional-style filtering using Streams.

### Use Case 9: Group Bogies by Type (groupingBy)

A small Java console app that shows how to group bogies using `Collectors.groupingBy()`.  
It takes a list of bogies and organizes them based on their type (name).

This application:
- Creates a list of bogie objects  
- Streams the list  
- Groups bogies by their name using `groupingBy`  
- Stores the result in a `Map<String, List<Bogie>>`  
- Displays each bogie type along with all its capacity entries  

A simple example of classification and grouping using Java Streams.

### Use Case 10: Count Total Seats in Train (reduce)

A small Java console app that shows how to aggregate values using `Stream.reduce()`.  
The program sums up the seating capacities of all bogies to produce a final total.

This application:
- Creates a list of bogie objects
- Extracts each bogie’s capacity using `map()`
- Uses `reduce()` to compute the total seating capacity
- Displays the final aggregated seat count

A simple example of performing aggregation operations using Java Streams.

### Use Case 11: Validate Train ID and Cargo Code (Regex)

A small Java console app that demonstrates how to validate input formats using regular expressions.  
The program accepts a Train ID and a Cargo Code from the user and checks if they follow the required patterns.

This application:
- Takes Train ID input from the user  
- Takes Cargo Code input  
- Applies regex rules using `Pattern` and `Matcher`  
- Prints whether each value matches the expected format  

A simple example of using regular expressions for format validation in Java.

### Use Case 12: Safety Compliance Check for Goods Bogies

A small Java console app that applies a real‑world safety rule to goods bogies using the Java Stream API.  
It checks whether each bogie follows the required cargo safety standard.

This application:
- Creates a list of goods bogies
- Uses a stream with `allMatch()` to apply a safety rule
- The rule: Cylindrical bogies must carry only Petroleum
- Displays whether the entire train formation is safe or not

A simple example of using Streams for rule-based validation.

### Use Case 13: Performance Comparison (Loops vs Streams)

A small Java console app that compares the execution time of loop-based filtering vs stream-based filtering.  
It uses `System.nanoTime()` to measure how long each approach takes to process a large dataset of bogies.

This application:
- Generates a large list of test bogies
- Filters bogies using a traditional `for` loop
- Filters the same dataset using a Stream with `filter()`
- Measures and prints the execution time of both methods
- Ensures both filtering methods return the same result

A simple example showing how Streams and loops perform under high-volume data processing.

### Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)

A small Java console app that shows how to enforce validation rules using a custom exception.  
It prevents creating passenger bogies with invalid seating capacity and handles errors gracefully.

This application:
- Defines a custom `InvalidCapacityException`
- Validates bogie capacity inside the constructor
- Throws an exception when capacity is zero or negative
- Creates valid bogies successfully
- Catches and displays errors for invalid bogies

A simple example of fail‑fast validation using checked exceptions in Java.

### Use Case 15: Safe Cargo Assignment Using try‑catch‑finally

A small Java console app that demonstrates how to safely assign cargo to goods bogies using structured exception handling.  
It validates cargo rules, throws a custom runtime exception for unsafe combinations, and ensures the `finally` block always runs.

This application:
- Defines a custom `CargoSafetyException`
- Applies a rule: Rectangular bogies cannot carry Petroleum
- Throws and catches the exception when the rule is violated
- Performs safe cargo assignment when valid
- Executes a `finally` block for logging after each attempt

A simple example of applying safety checks and handling runtime errors using try‑catch‑finally.

### Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)

A small Java console app that demonstrates how to manually sort values using the Bubble Sort algorithm.  
Instead of using built‑in sorting utilities, this example walks through basic algorithmic sorting logic.

This application:
- Creates an array of passenger bogie capacities  
- Compares adjacent elements  
- Swaps values when they are out of order  
- Repeats passes until the array is fully sorted  
- Prints the final sorted capacities  

A simple introduction to understanding how Bubble Sort works under the hood.

### Use Case 17: Sort Bogie Names Using Arrays.sort()

A small Java console app that shows how to sort bogie names alphabetically using Java’s built‑in `Arrays.sort()` method.  
It demonstrates optimized sorting using standard library utilities instead of custom algorithms.

This application:
- Creates an array of bogie type names
- Prints the original unsorted list
- Sorts the names using `Arrays.sort()`
- Displays the sorted bogie names in alphabetical order

A simple example of using Java’s built‑in array sorting features.

### Use Case 18: Linear Search for Bogie ID (Array-Based Searching)

A small Java console app that demonstrates how to search for a bogie ID using a simple Linear Search algorithm.  
It checks each element in sequence until a match is found (or not found).

This application:
- Creates an array of bogie IDs  
- Prints all available IDs  
- Searches for specific IDs using linear traversal  
- Stops as soon as a match is detected  
- Displays whether each ID was found or not  

A simple example of sequential searching without using built‑in search utilities.

### Use Case 19: Binary Search for Bogie ID (Optimized searching)

A small Java console app that shows how to search for a bogie ID using the Binary Search algorithm.  
This example performs fast, divide‑and‑conquer searching on a sorted list of IDs.

This application:
- Creates a sorted array of bogie IDs  
- Prints the available IDs  
- Applies manual binary search logic  
- Narrows the search range on each iteration  
- Displays whether the target bogie ID was found  

A simple example of optimized searching using binary search instead of linear traversal.

### Use Case 20: Exception Handling During Search Operations

A small Java console app that demonstrates how to prevent invalid search operations using defensive programming.  
It checks whether bogies exist before searching and throws an exception if the collection is empty.

This application:
- Creates a bogie ID array (empty scenario)
- Validates the system state before searching
- Throws an `IllegalStateException` when no bogies are available
- Stops the search operation early
- Displays a clear, meaningful error message

A simple example of fail‑fast validation using runtime exceptions to avoid unsafe operations.
