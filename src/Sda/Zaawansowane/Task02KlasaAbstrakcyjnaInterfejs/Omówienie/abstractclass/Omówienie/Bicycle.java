package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Omówienie.abstractclass.Omówienie;

public class Bicycle extends Vehicle {

    public Bicycle(int speed, int maxSpeed) {
        super(speed, maxSpeed);
    }

    @Override
    public void repair() {
        System.out.println("Naprawiam rower = sprawdzam kierownicę, łańcuch itd.");

    }
}
