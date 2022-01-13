package JavaStart.Cwiczenie.Hospital;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Dostępne opcje:");
            System.out.println();
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlanie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(input.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(input.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatients:
                    hospital.printPatient();
                    break;
                case exit:
                    System.out.println("Zamykam program!");
                default:
                    System.out.println("nie znaleziono takiej opcji");

            }
        }
        input.close();
    }
}
