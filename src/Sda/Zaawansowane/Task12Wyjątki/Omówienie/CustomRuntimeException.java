package Sda.Zaawansowane.Task12Wyjątki.Omówienie;

public class CustomRuntimeException extends RuntimeException {

    private int x;

    public CustomRuntimeException(String message, int x) {
        super(message);
        this.x = x;
    }

    public int getX() {
        return x;
    }

}
