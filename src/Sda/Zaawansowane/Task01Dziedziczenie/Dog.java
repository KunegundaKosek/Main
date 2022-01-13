package Sda.Zaawansowane.Task01Dziedziczenie;

public class Dog extends Animal {

    private String breed;

    public Dog(int weight, String breed) {
        super("Pies domowy", weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeASound() {
        System.out.println("Hau! Hau!");
    }

    @Override
    public String toString() {
        return super.toString() + ", rasa: " + breed;
    }
}
