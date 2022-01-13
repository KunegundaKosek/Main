package Sda.Zaawansowane.Task01Dziedziczenie;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------Przykład uzycia klasy Animal--------------");

        //przykład tworzenia zwierzęcia

        Animal animal1 = new Animal("mysz polna", 123) {
            @Override
            public void makeASound() {

            }
        };
        System.out.println(animal1.getSpecies());
        animal1.makeASound();

        System.out.println("\n-----------Przykład użycia klasy Dog------------");

        Dog dog1 = new Dog(4321, "York");
        System.out.println(dog1.getBreed());

        System.out.println(dog1.getSpecies());
        System.out.println(dog1.getWeight());
        dog1.makeASound();

        System.out.println("\n------------------Polimorfizm--------------------");
        Animal animal2 = dog1;
        System.out.println(animal2.getSpecies());
        animal2.makeASound();

        Animal[] animals = {
                animal1,
                dog1,
                new Animal("kot", 3000) {
                    @Override
                    public void makeASound() {

                    }
                },
                new Dog(10000, "owczarek niemiecki")
        };
        System.out.println("\nWagi zwięrząt z tablicy:");
        for (Animal animal : animals) {
            System.out.println(animal.getWeight());
        }

        System.out.println("\nWywoływanie dla obiektu klasy Dog:");
        describe(dog1);

        System.out.println("\n----------Object-----------");
        Object object1 = dog1;
        Object object2 = "abc";

        System.out.println(dog1.toString());
        System.out.println(dog1);
        System.out.println(animal1);

    }

    private static void describe(Animal animal) {
        System.out.println("Gatunek zwierzęcua: " + animal.getSpecies());
        System.out.println("Waga zwierzęcia: " + animal.getWeight());
    }
}
