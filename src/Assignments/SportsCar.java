package Assignments;

public class SportsCar extends Vehicle implements Automobile {
    private double accelerationTime;
    private boolean turboMode;
    private int currentGear;
    private boolean engineRunning;

    public SportsCar(String brand, String model, int year, double accelerationTime) {
        super(brand, model, year, 4);
        this.accelerationTime = accelerationTime;
        this.turboMode = false;
        this.currentGear = 0;
        this.engineRunning = false;
    }

    @Override
    public void accelerate() {
        if (engineRunning && leveloffuel > 0) {
            int accelerationRate = turboMode ? 30 : 15;
            speed += accelerationRate;
            leveloffuel -= (turboMode ? 3 : 1.5);
            System.out.println("Sports car accelerating FAST! Speed: " + speed + " km/h" +
                    (turboMode ? " [TURBO MODE]" : ""));
        } else if (!engineRunning) {
            System.out.println("Start the engine first!");
        } else {
            System.out.println("Out of fuel!");
        }
    }

    @Override
    public void brake() {
        speed = 0;
        System.out.println("Sports car screeches to a stop!");
    }

    @Override
    public void drive() {
        leveloffuel = Math.min(leveloffuel + 20, 100);
        System.out.println("Refueled sports car with premium fuel. Fuel level: " + leveloffuel + "%");
    }

    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Sports car engine roars to life! VROOM VROOM!");
        }
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports car cornering left with precision");
    }

    @Override
    public void turnRight() {
        System.out.println("Sports car cornering right with precision");
    }

    @Override
    public void honk() {
        System.out.println("Sports car: BEEP BEEP!");
    }

    @Override
    public void changeGear(int gear) {
        if (gear >= 0 && gear <= 6) {
            this.currentGear = gear;
            System.out.println("Sports car shifted to gear: " + gear);
        }
    }

    // Additional method
    public void activateTurbo() {
        if (!turboMode) {
            turboMode = true;
            System.out.println("TURBO MODE ACTIVATED! 🚀");
        } else {
            System.out.println("Turbo already active!");
        }
    }

    public void deactivateTurbo() {
        if (turboMode) {
            turboMode = false;
            System.out.println("Turbo mode deactivated.");
        }
    }
}