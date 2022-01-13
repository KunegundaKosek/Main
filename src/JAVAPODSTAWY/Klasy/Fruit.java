package JAVAPODSTAWY.Klasy;

public class Fruit {
    String vitamins;
    String name;

    Fruit(String name, String vitamins) {
        this.vitamins = vitamins;
        this.name = name;
    }

    Fruit(String name) {
        this(name, "all");
    }

    Fruit() {
        this("kiwi");
    }

    public String getName() {
        return name;
    }

    String makeJuice() {
        return name + " juice";
    }
}

