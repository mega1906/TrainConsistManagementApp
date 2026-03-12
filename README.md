# TrainConsistManagementApp

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