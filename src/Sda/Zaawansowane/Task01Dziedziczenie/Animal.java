package Sda.Zaawansowane.Task01Dziedziczenie;

public abstract class Animal {

    private String species;

    private int weight;
    public Animal(String species, int weight) {
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public int getWeight() {
        return weight;
    }

    protected void makeASoung() {
        System.out.println("Zwierzę wydaje odgłos");
    }

    @Override
    public String toString() {
        return "gatunek: " + species + ", waga: " + weight;
    }

    public abstract void makeASound();
}
