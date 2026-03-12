# TrainConsistManagementApp

### Use Case 12: Safety Compliance Check for Goods Bogies

A small Java console app that applies a real‑world safety rule to goods bogies using the Java Stream API.  
It checks whether each bogie follows the required cargo safety standard.

This application:
- Creates a list of goods bogies
- Uses a stream with `allMatch()` to apply a safety rule
- The rule: Cylindrical bogies must carry only Petroleum
- Displays whether the entire train formation is safe or not

A simple example of using Streams for rule-based validation.