# TrainConsistManagementApp

### Use Case 10: Count Total Seats in Train (reduce)

A small Java console app that shows how to aggregate values using `Stream.reduce()`.  
The program sums up the seating capacities of all bogies to produce a final total.

This application:
- Creates a list of bogie objects
- Extracts each bogie’s capacity using `map()`
- Uses `reduce()` to compute the total seating capacity
- Displays the final aggregated seat count

A simple example of performing aggregation operations using Java Streams.