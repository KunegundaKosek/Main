package Sda.Zaawansowane.Task08ComparableTreeSetTreeMap;

public class Car implements Comparable<Car>{

    private int speed;
    private String model;

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }


    @Override
    public int compareTo(Car car) {
        return speed - car.speed;
    }
}
