package Assignments;

public class Bus extends Vehicle {
    private int passengerCapacity;
    private int currentPassengers;
    private String routeNumber;

    public Bus(String nameofbrand, String nameofmodel, int year, int passengerCapacity, String routeNumber) {
        super(nameofbrand, nameofmodel, year, 6); // Buses have 6 wheels
        this.passengerCapacity = passengerCapacity;
        this.routeNumber = routeNumber;
        this.currentPassengers = 0;
    }

    @Override
    public void accelerate() {
        if (leveloffuel > 0) {
            speed += 5; // Buses accelerate slowly due to weight
            leveloffuel -= 2; // Buses consume more fuel
            System.out.println("Bus accelerating slowly... Speed: " + speed + " km/h");
        } else {
            System.out.println("Out of fuel! Bus cannot move.");
        }
    }

    @Override
    public void brake() {
        speed = 0;
        System.out.println("Bus stopped at bus stop.");
    }

    @Override
    public void drive() {
        leveloffuel = Math.min(leveloffuel + 40, 100);
        System.out.println("Refueled bus. Fuel level: " + leveloffuel + "%");
    }

    // Additional methods
    public void boardPassenger(int count) {
        if (currentPassengers + count <= passengerCapacity) {
            currentPassengers += count;
            System.out.println(count + " passengers boarded. Total: " + currentPassengers);
        } else {
            System.out.println("Bus is full! Only " + (passengerCapacity - currentPassengers) + " seats available.");
        }
    }

    public void announceNextStop() {
        System.out.println("Next stop: " + routeNumber + " route");
    }
}