package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Omówienie.abstractclass.Omówienie;

public class Car extends Vehicle {

    private boolean convertible;

    public Car(int speed, int maxSpeed, boolean convertible) {
        super(speed, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "convertible=" + convertible +
                "}" + super.toString();
    }
    @Override
    public void repair() {
        System.out.println("Naprawiam samochów - zaglądam pod maskę itd.");
    }
}

