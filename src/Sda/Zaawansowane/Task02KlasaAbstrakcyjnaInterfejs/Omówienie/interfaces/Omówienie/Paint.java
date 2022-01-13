package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Omówienie.interfaces.Omówienie;

public class Paint implements Colored {

    private String color;
    private double volume;

    public Paint(String color, double volume) {
        this.color = color;
        this.volume = volume;
    }
    @Override
    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }
}
