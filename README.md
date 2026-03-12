# TrainConsistManagementApp

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