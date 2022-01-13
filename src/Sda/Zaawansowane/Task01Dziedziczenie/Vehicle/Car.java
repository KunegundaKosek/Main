package Sda.Zaawansowane.Task01Dziedziczenie.Vehicle;

public class Car extends Vehicle {

    private boolean convertible;

    public Car(int speed,int maxSpeed, boolean convertible) {
        super(speed, maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public String toString() {
        return super.toString() + ", czy kabriolet: " + convertible;
    }
}
