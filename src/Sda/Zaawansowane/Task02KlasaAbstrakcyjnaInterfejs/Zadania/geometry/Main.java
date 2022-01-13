package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Zadania.geometry;

public class Main {

    public static void main(String[] args) {
        System.out.println("------- Zadania 1, 2 -----------");
        Shape shape1 = new Rectangle("zielony", 3, 4);
        System.out.println("Pole powierzchni figury 1 (prostokąta): " + shape1.getArea());
        System.out.println("Obwód figury 1 (prostokąta): " + shape1.getPerimeter());

        System.out.println("\n----- Zadanie 3 --------");
        Shape shape2 = new Circle("czarny", 5);
        System.out.println("Pole powierzchni figury 2 (koła): " + shape2.getArea());
        System.out.println("Obwód figury 2 (koła): " + shape2.getPerimeter());
    }
}
