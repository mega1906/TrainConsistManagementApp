# TrainConsistManagementApp

### Use Case 9: Group Bogies by Type (groupingBy)

A small Java console app that shows how to group bogies using `Collectors.groupingBy()`.  
It takes a list of bogies and organizes them based on their type (name).

### This application:
- Creates a list of bogie objects  
- Streams the list  
- Groups bogies by their name using `groupingBy`  
- Stores the result in a `Map<String, List<Bogie>>`  
- Displays each bogie type along with all its capacity entries  

A simple example of classification and grouping using Java Streams.