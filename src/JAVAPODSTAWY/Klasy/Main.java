package JAVAPODSTAWY.Klasy;

public class Main {
    public static void main(String[] args) {

        Fruit fruit = new Fruit("Jabłko", "A");
        fruit.vitamins = "A, C, B12";

        String vitamins = fruit.vitamins;
        String fruitName = fruit.name;

        String name = "Zielone jabłko";
        fruit.name = name;

        Fruit owoc = new Fruit("Truskawka", "C");
        owoc.name = "Truskawka";

        Fruit apple = new Fruit("Green apply", "A");
        Fruit orange = new Fruit("Sweet orange", "C, D");
        Fruit strawberry = new Fruit("Truskawka");
        Fruit kiwi = new Fruit();

        String name1 = strawberry.getName();
        String juiceName = kiwi.makeJuice();


    }
}
