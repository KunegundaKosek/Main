package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Omówienie.interfaces.Omówienie;

public class Main {

    public static void main(String[] args) {

        Colored colored1 = new Paint("czerwony", 2);
        System.out.println("Kolor farby: " + colored1.getColor());

        Colored colored2 = new Grass(123);
        System.out.println("Kolor trawy: " + colored2.getColor());
    }
}
