package Sda.Zaawansowane.Task05equalsIHashCode;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metody equaks używamy do sprawdzenie, czy jeden obiekt jest równy drugiemu.

    @Override
    public boolean equals(Object obj) {
        //Jeśli obiekt, z którym porównujemy punky nie jest instancją klasy Point

        if (!(obj instanceof Point)) {
            //zwracamy fałsz jako wynik porównania.
            return false;
        }
        // W innym wypadku - jeśli wiemy, że obiekt, z którym porównujemy punkt jest instancją klasy Point,
        // to możemy bezpiecznie rzutować go na typ Point.

        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return x + 31 * y;
    }
}
