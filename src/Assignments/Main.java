package Assignments;

public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("ADVANCED OOP LAB 1 - DEMONSTRATION");
        System.out.println("=".repeat(60));

        // Create instance of Sedan (5 marks requirement)
        System.out.println("\n--- PART 1: Creating Sedan Instance ---");
        Sedan mySedan = new Sedan("Toyota", "Camry", 2022, 500, 4);
        mySedan.toString();

        System.out.println("\n--- PART 2: Demonstrating Method Overloading ---");
        // Method Overloading - Same method name, different parameters
        System.out.println("\n2a. accelerate() - No parameters (default):");
        mySedan.startEngine();
        mySedan.accelerate();

        System.out.println("\n2b. accelerate(int speedIncrease) - With integer parameter:");
        mySedan.accelerate(20);

        System.out.println("\n2c. accelerate(boolean smoothMode) - With boolean parameter:");
        mySedan.accelerate(true);  // Smooth mode
        mySedan.accelerate(false); // Fast mode

        System.out.println("\n--- PART 3: Demonstrating Method Overriding ---");
        // Method Overriding - Different implementations in subclasses

        System.out.println("\n3a. Sedan's accelerate() implementation:");
        Sedan anotherSedan = new Sedan("Honda", "Accord", 2023, 450, 4);
        anotherSedan.startEngine();
        anotherSedan.accelerate(); // Sedan version

        System.out.println("\n3b. SportsCar's accelerate() implementation (overridden):");
        SportsCar ferrari = new SportsCar("Ferrari", "F8 Tributo", 2023, 2.9);
        ferrari.startEngine();
        ferrari.accelerate(); // SportsCar version (overridden)
        ferrari.activateTurbo();
        ferrari.accelerate(); // Turbo mode acceleration

        System.out.println("\n3c. Motorcycle's accelerate() implementation (overridden):");
        Motorcycle harley = new Motorcycle("Harley-Davidson", "Street 750", 2022, 750, false);
        harley.drive();
        harley.accelerate(); // Motorcycle version

        System.out.println("\n3d. Bus's accelerate() implementation (overridden):");
        Bus cityBus = new Bus("Mercedes", "Citaro", 2021, 50, "Route 42");
        cityBus.drive();
        cityBus.accelerate(); // Bus version (slower)

        System.out.println("\n--- PART 4: Complete Vehicle Operations Demo ---");

        // Polymorphism demonstration
        System.out.println("\n--- Polymorphism: Treating all vehicles as Vehicles ---");
        Vehicle[] vehicles = {
                new Sedan("Tesla", "Model 3", 2023, 425, 4),
                new SportsCar("Porsche", "911", 2023, 3.2),
                new Motorcycle("Yamaha", "R1", 2022, 998, false),
                new Bus("Volvo", "B8L", 2023, 80, "Downtown Express")
        };

        for (Vehicle v : vehicles) {
            System.out.println("\nStarting vehicle: " + v.nameofbrand + " " + v.nameofmodel);
            if (v instanceof Automobile) {
                ((Automobile) v).startEngine();
            }
            v.accelerate(); // Polymorphic call - each behaves differently
            v.brake();
        }

        System.out.println("\n--- PART 5: Interface Demonstration ---");
        Automobile.printAutomobileInfo();

        System.out.println("\nDemonstrating interface methods with Sedan:");
        mySedan.turnLeft();
        mySedan.turnRight();
        mySedan.honk();
        mySedan.changeGear(3);
        mySedan.emergencyBrake();

        System.out.println("\n--- PART 6: Full Sedan Workflow ---");
        Sedan finalSedan = new Sedan("BMW", "3 Series", 2024, 480, 4);
        finalSedan.toString();
        finalSedan.startEngine();
        finalSedan.changeGear(1);
        finalSedan.accelerate();
        finalSedan.accelerate(25);
        finalSedan.turnRight();
        finalSedan.accelerate(true);
        finalSedan.brake();
        finalSedan.drive();
        finalSedan.openTrunk();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("LAB COMPLETED SUCCESSFULLY!");
        System.out.println("All concepts demonstrated:");
        System.out.println("✓ Abstract Class Vehicle");
        System.out.println("✓ Interface Automobile");
        System.out.println("✓ Inheritance (Motorcycle, Bus, Sedan, SportsCar)");
        System.out.println("✓ Polymorphism (Vehicle array with different behaviors)");
        System.out.println("✓ Method Overloading (accelerate methods in Sedan)");
        System.out.println("✓ Method Overriding (accelerate in all subclasses)");
        System.out.println("=".repeat(60));
    }
}