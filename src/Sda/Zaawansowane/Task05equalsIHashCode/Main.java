package Sda.Zaawansowane.Task05equalsIHashCode;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(2, 1);
        Point point2 = new Point(2, 1);

        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}
