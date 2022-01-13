package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Omówienie.interfaces.Omówienie;

public class Grass implements Colored {
    private int height;

    public Grass(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    // Klasa Grass implementuje interfejs Colored, w którym mamy zadeklarowaną metodę String getColor().
    // W związku z tym musimy tę metodę zaimplementować.
    // Wszystkie instancje klasy Grass (trawa) będą zielone.
    @Override
    public String getColor() {
        return "zielony";
    }
}
