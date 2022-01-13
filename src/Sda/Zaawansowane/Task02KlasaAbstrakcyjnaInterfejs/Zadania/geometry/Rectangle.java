package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Zadania.geometry;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
