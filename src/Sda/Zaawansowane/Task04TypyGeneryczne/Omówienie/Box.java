package Sda.Zaawansowane.Task04TypyGeneryczne.Omówienie;

public class Box<T> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
