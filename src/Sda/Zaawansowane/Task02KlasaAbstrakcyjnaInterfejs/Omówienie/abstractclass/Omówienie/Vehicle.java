package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Omówienie.abstractclass.Omówienie;

public abstract class Vehicle {

    private int speed;
    private int maxSpeed;

    public Vehicle(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public abstract void repair();
}
