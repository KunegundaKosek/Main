package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Zadania.product;

public class ChocolateBar implements Product {

    private double price;
    private double weight;

    public ChocolateBar(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
