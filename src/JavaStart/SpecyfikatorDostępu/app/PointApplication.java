package JavaStart.SpecyfikatorDostępu.app;

import JavaStart.SpecyfikatorDostępu.controller.PointController;
import JavaStart.SpecyfikatorDostępu.data.Point;

public class PointApplication {

    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        PointController pc = new PointController();

        System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
        pc.addX(p1);
        System.out.println("Punkt addX: (" + p1.getX()+";"+p1.getY()+")");
        pc.addY(p1);
        System.out.println("Punkt addY: (" + p1.getX()+";"+p1.getY()+")");
        pc.minusX(p1);
        System.out.println("Punkt minusX: (" + p1.getX()+";"+p1.getY()+")");
        pc.minusY(p1);
        System.out.println("Punkt minusY: (" + p1.getX()+";"+p1.getY()+")");

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = addX;

        switch (option) {
            case addX:
                pc.addX(p1);
                break;
            case addY:
                pc.addY(p1);
                break;
            case minusX:
                pc.minusX(p1);
                break;
            case minusY:
                pc.minusX(p1);
                break;

            default:
                System.out.println("Podano błędną wartość");
        }

        System.out.println("Punkt po zmianie: (" + p1.getX() + ";" + p1.getY() + ")");
    }
}
