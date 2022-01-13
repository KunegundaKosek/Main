package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Omówienie.abstractclass.Omówienie;

public class Main {

    public static void main(String[] args) {

//nie możemy utworzyć instancji klasy abstrakcyjnej

        Vehicle vehicle1 = new Car(80, 200, true);
        System.out.println(vehicle1);
        vehicle1.repair();

        Vehicle vehicle2 = new Bicycle(20, 50);
        System.out.println(vehicle2);
        vehicle2.repair();
    }
}
