# Car Customization Application

This Java project demonstrates the concepts of **inheritance** and the **decorator design pattern** by implementing a car customization system. Users can select a car model and add various optional features, with the final cost and description dynamically calculated.

---

## Features

1. **Car Models**:
   - Choose from three base car models:  
     - Model C: $32,000  
     - Model E: $45,000  
     - Model CS: $60,000  

2. **Customizable Options**:
   - Add optional features to your car:
     - V-8 Engine (+$4,400)
     - V-12 Engine (+$6,400)
     - Sunroof (cost varies by model: +$1,940 for Model C, +$2,240 for Model E, +$3,400 for Model CS)
     - Blaupunkt New York 800 Radio (+$940)
     - Spare Tire (+$440)
     - Oversized Gas Tank (+$940)

3. **Dynamic Cost Calculation**:
   - The total cost updates as features are added.

4. **Interactive Console Application**:
   - Users interact through a command-line interface to select car models and customize them.

---

## How It Works

### Core Concepts
- **Inheritance**: 
  - The base `Car` interface is implemented by different car models (`Model_C`, `Model_E`, `Model_CS`).
- **Decorator Pattern**: 
  - Optional features like engines, sunroofs, and radios are implemented as decorators that wrap around a base car object to dynamically modify its behavior (e.g., cost and description).

### Workflow
1. The user selects a base car model (`C`, `E`, or `CS`).
2. The user adds optional features (e.g., "V-8", "Sun Roof", "Radio").
3. The program calculates and displays the updated description and total cost.
4. The process repeats until the user types "done" to finalize their order or "quit" to exit.

---

## Example Usage

### Input
```text
Enter car model(C, E, CS) or quit to exit: C
Option (V-8, V-12, Sun Roof, Baupunkt New York 800 Radio (Radio), Spare Tire, Oversized Gas Tank(OGT), done): V-8
Option (V-8, V-12, Sun Roof, Baupunkt New York 800 Radio (Radio), Spare Tire, Oversized Gas Tank(OGT), done): Sun Roof
Option (V-8, V-12, Sun Roof, Baupunkt New York 800 Radio (Radio), Spare Tire, Oversized Gas Tank(OGT), done): done
```

### Output
```text
New Order:
   Car: Model C with V-8 Engine, Sun Roof
   Cost: $38,340
End Order
```

---

## Project Structure

The project consists of the following classes:

1. **Base Interface (`Car`)**:
   - Defines methods for `getCost()`, `getInfo()`, and `getType()`.

2. **Car Models**:
   - `Model_C`, `Model_E`, and `Model_CS`: Implement the base interface with unique costs and descriptions.

3. **Decorator Class**:
   - Abstract class `Decorator`: Wraps a `Car` object to add new functionality.

4. **Optional Features**:
   - `V8Engine`, `V12Engine`, `Radio`, `SpareTire`, `SunRoof`, and `OversizedGasTank`: Extend the decorator class to modify cost and description dynamically.

5. **Application Entry Point (`CarApp`)**:
   - Handles user input via a console-based menu system.

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed on your system.

### Steps
1. Clone this repository.
2. Compile all `.java` files:
   ```bash
   javac *.java
   ```
3. Run the application:
   ```bash
   java CarApp
   ```

