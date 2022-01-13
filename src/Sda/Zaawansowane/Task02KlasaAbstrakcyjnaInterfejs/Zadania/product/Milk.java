package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Zadania.product;

public class Milk implements Product {

    //w litrach
    private double volume;

    //w kg/litr
    private double density;
    private double pricePerKg;

    public Milk(double volume, double density, double pricePerKg) {
        this.volume = volume;
        this.density = density;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double getPrice() {
        return getWeight() * pricePerKg;
    }

    @Override
    public double getWeight() {
        return volume * density;
    }
}
