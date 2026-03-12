# TrainConsistManagementApp

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
