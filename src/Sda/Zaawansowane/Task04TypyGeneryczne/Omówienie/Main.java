package Sda.Zaawansowane.Task04TypyGeneryczne.Omówienie;

public class Main {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("ABC");
        String stringElement = stringBox.getElement();

        Box<Integer> intBox = new Box<>(123);
        int intElement = intBox.getElement();
    }
}
