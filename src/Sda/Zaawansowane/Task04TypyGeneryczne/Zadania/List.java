package Sda.Zaawansowane.Task04TypyGeneryczne.Zadania;

import java.util.Arrays;

public class List<T> {

    private T[] elements;

    public List(T... elements) {
        this.elements = elements;
    }

    public T getFirst() {
        return elements[0];
    }

    public T getLast() {
        return elements[elements.length - 1];
    }

    public T get(int index) {
        return elements[index];
    }

    public int size() {
        return elements.length;
    }

    public void set(int index, T element) {
        elements[index] = element;
    }

    public boolean contains(T element) {
        for (T listElement : elements) {
            if (listElement.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    //wersja 1:

    public void add(T element) {
        T[] newElements = (T[]) new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];

        }

        newElements[newElements.length - 1] = element;
        elements = newElements;
    }

    //Wersja 2:
    /*public void add(T element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;*/
  //  }
}
