# TrainConsistManagementApp

### Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)

A small Java console app that shows how to maintain the attachment order of train bogies while still avoiding duplicates using a `LinkedHashSet`.  
It combines the benefits of ordering (like a list) with uniqueness (like a set).

This application:
- Attaches bogies in the exact order they are added
- Automatically ignores duplicate bogies
- Preserves insertion sequence
- Prints the final train formation

Great for cases where the order of bogie attachment matters but duplicates should never be allowed.