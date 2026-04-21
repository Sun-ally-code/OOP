package Assignments;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int engineCC;

    public Motorcycle (String nameofbrand, String nameofmodel, int year, int engineCC, boolean hasSidecar) {
        super (nameofbrand,nameofmodel, year, 2);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void accelerate () {
        if (leveloffuel > 0) {
            speed += 20;
            leveloffuel -= 0.5;
            System.out.println("Motorcycle accelerated!" + speed + "km/hr");
        } else {
            System.out.println("Out of fuel, can't accelerate!");
        }
    }

    @Override
    public void brake () {
        speed = 0;
        System.out.println("Motorcycle braked!");
    }

    @Override
    public void drive (){
        leveloffuel = Math.min(leveloffuel + 15, 100);
        System.out.println("Motorcycle driven!" + leveloffuel + "%");
    }
    public void wheelie (){
        if (speed > 30 && !hasSidecar) {
            System.out.println("Doing a wheelie");
        } else if (hasSidecar) {
            System.out.println("Cannot do wheelie with sidecar. ");
        } else {
            System.out.println("Speed to low for a wheelie");
        }
    }
}
