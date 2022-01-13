package Sda.Zaawansowane.Task11Optional.Omówienie;

import java.util.Optional;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> names = Set.of("Darek", "Janusz","Alicja");

        Optional<String> optional = names.stream()
                .filter(name -> name.startsWith("D"))
                .findFirst();

        System.out.println("Czy mamy wartość opakowaną w optionala: " + optional.isPresent());

        if (optional.isPresent()) {
            System.out.println("Wartość opakowana w optionala: " + optional.get());
        } else {
            System.out.println("Brak wartości opakowanej w optionala");
        }

        optional.ifPresent(name -> System.out.println("Akcja wywoływana, gdy wartość pod optionalem jest obecna. " + "Ta wartość to: " + name));

        System.out.println("Wartość zwrócona przez metodę orElse: " + optional.orElse("Wartość domyślna"));

        Optional<String> optional1 = Optional.of("ABCDE");

        Optional<String> optional2 = Optional.empty();


    }
}
