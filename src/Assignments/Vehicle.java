package Assignments;

public abstract class Vehicle {
    protected String nameofbrand;
    protected String nameofmodel;
    protected int year;
    protected int numberofwheels;
    protected double speed;
    protected double leveloffuel;

    public Vehicle (String nameofbrand, String nameofmodel, int year, int numberofwheels) {
        this.nameofmodel = nameofbrand;
        this.nameofmodel = nameofmodel;
        this.year = year;
        this.numberofwheels = numberofwheels;
        this.speed = 0;
        this.leveloffuel = 100.0;
    }

    public double  getSpeed() {
        return speed;
    }
    public double getLeveloffuel() {
        return leveloffuel;
    }
    public void setLeveloffuel(double leveloffuel) {
        this.leveloffuel = leveloffuel;
    }

    public abstract void accelerate ();
    public abstract void brake();
    public abstract void drive();
}
