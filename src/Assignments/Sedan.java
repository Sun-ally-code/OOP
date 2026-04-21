package Assignments;

public class Sedan extends Vehicle implements Automobile {
    private int trunkCapacity;
    private int numberOfDoors;
    private int currentGear;
    private boolean engineRunning;

    public Sedan(String nameofbrand, String nameofmodel, int year, int trunkCapacity, int numberOfDoors) {
        super(nameofbrand, nameofmodel, year, 4);
        this.trunkCapacity = trunkCapacity;
        this.numberOfDoors = numberOfDoors;
        this.currentGear = 0; // Neutral
        this.engineRunning = false;
    }

    // Implementing Vehicle abstract methods
    @Override
    public void accelerate() {
        if (engineRunning && leveloffuel > 0) {
            speed += 10;
            leveloffuel -= 1;
            System.out.println("Sedan accelerating smoothly. Speed: " + speed + " km/h, Gear: " + currentGear);
        } else if (!engineRunning) {
            System.out.println("Start the engine first!");
        } else {
            System.out.println("Out of fuel!");
        }
    }

    // OVERLOADED accelerate method (for 10 marks requirement)
    public void accelerate(int speedIncrease) {
        if (engineRunning && leveloffuel > 0) {
            speed += speedIncrease;
            leveloffuel -= (speedIncrease / 10.0);
            System.out.println("Sedan accelerating by " + speedIncrease + " km/h. Speed: " + speed + " km/h");
        } else if (!engineRunning) {
            System.out.println("Start the engine first!");
        } else {
            System.out.println("Out of fuel!");
        }
    }

    public void accelerate(boolean smoothMode) {
        if (smoothMode) {
            accelerate(5); // Smooth acceleration
        } else {
            accelerate(15); // Fast acceleration
        }
    }

    @Override
    public void brake() {
        speed = 0;
        System.out.println("Sedan stopped.");
    }

    @Override
    public void drive() {
        leveloffuel = Math.min(leveloffuel + 25, 100);
        System.out.println("Refueled sedan. Fuel level: " + leveloffuel + "%");
    }

    // Implementing Automobile interface methods
    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Sedan engine started. Vroom!");
        } else {
            System.out.println("Engine already running!");
        }
    }

    @Override
    public void turnLeft() {
        System.out.println("Sedan turning left with turn signal");
    }

    @Override
    public void turnRight() {
        System.out.println("Sedan turning right with turn signal");
    }

    @Override
    public void honk() {
        System.out.println("Sedan: Beep beep!");
    }

    @Override
    public void changeGear(int gear) {
        if (gear >= 0 && gear <= 5) {
            this.currentGear = gear;
            System.out.println("Sedan changed to gear: " + gear);
        } else {
            System.out.println("Invalid gear for sedan!");
        }
    }

    // Additional method
    public void openTrunk() {
        System.out.println("Trunk opened. Capacity: " + trunkCapacity + " liters");
    }
}