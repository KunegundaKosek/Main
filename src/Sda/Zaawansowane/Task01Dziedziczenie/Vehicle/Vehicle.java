package Sda.Zaawansowane.Task01Dziedziczenie.Vehicle;

public class Vehicle {

    private int speed;
    private int maxSpeed;

    public Vehicle(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "prędkość: " + speed + ", prędkość maksymalna: " + maxSpeed;
    }
}
