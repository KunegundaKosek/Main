package Sda.Zaawansowane.Task01Dziedziczenie.Toy;

public class TeddyBear extends Toy {

    private String name;

    public TeddyBear(int price, int minAge, String name) {
        super(price, minAge);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
