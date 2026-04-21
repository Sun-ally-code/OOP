package Assignments;

public interface Automobile {
    int MAX_SPEED_LIMIT = 120;
    int MIN_WHEELS = 3;
    String FUEL_TYPE = "Gasoline";

    void startEngine();
    void turnLeft();
    void turnRight();
    void honk();
    void changeGear(int gear);

    default void emergencyBrake() {
        System.out.println("EMERGENCY BRAKE ACTIVATED!");
    }

    static void printAutomobileInfo() {
        System.out.println("An automobile has " + MIN_WHEELS + "+ wheels");
        System.out.println("Uses " + FUEL_TYPE + " fuel");
        System.out.println("Max speed limit: " + MAX_SPEED_LIMIT + " km/h");
    }
}
