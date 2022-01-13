package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Zadania.geometry;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
