package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Zadania.product;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n----- Zadanie 4, 5 --------");
        Product product1 = new ChocolateBar(3, 15);
        System.out.println("Cena produktu1 (batonika): " + product1.getPrice());
        System.out.println("Waga produktu1 (batonika): " + product1.getWeight());

        System.out.println("\n----- Zadanie 5 --------");
        Product product2 = new Milk(1, 0.91, 3);
        System.out.println("Cena produktu1 (mleka): " + product2.getPrice());
        System.out.println("Waga produktu2 (mleka): " + product2.getWeight());

        System.out.println("\n----- Zadanie 12 --------");
        ShoppingCart shoppingCart1 = new ShoppingCart(product1, product2);
        System.out.println(shoppingCart1.getTotalPrice());

    }
}
