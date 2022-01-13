package Sda.Zaawansowane.Task01Dziedziczenie.Vehicle;

public class Main {

    public static void main(String[] args) {

        System.out.println("------- Zadanie 3 ----------");

        Vehicle vehicle1 = new Vehicle(30, 50);
        System.out.println(vehicle1.getSpeed());

        System.out.println("\n------- Zadanie 4 ----------");
        Car car1 = new Car(50, 190, false);
        System.out.println(car1.getSpeed());
        System.out.println(car1.getMaxSpeed());
        System.out.println(car1.isConvertible());

        System.out.println("\n------- Zadanie 5 ----------");
        System.out.println(vehicle1);

        System.out.println("\n------- Zadanie 6 ----------");
        System.out.println(car1);




    }
}
