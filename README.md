# TrainConsistManagementApp

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