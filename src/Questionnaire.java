import java.sql.SQLOutput;
import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        int age;
        double height;
        //final String pesel = "910224213234";
        String carBrand;
        String carModel;
        int carYear;
        boolean answer;

        System.out.println("Jak masz na imię?");
        firstName = scanner.next();

        System.out.println("Jak masz na nazwisko?");
        lastName = scanner.next();

        System.out.println("Ile masz lat?");
        age = scanner.nextInt();

        System.out.println("Ile masz wzrostu?");
        height = scanner.nextDouble();

        System.out.println("Jakim jezdzisz samochodem?");
        carBrand = scanner.next();

        System.out.println("Jaki to model?");
        carModel = scanner.next();

        System.out.println("Jaki rocznik?");
        carYear = scanner.nextInt();


        //Podsumowanie
        System.out.println("Cześć" + firstName + " " + lastName);
        System.out.println("W ankiecie odpowiedziałeś, że masz " + age + " lat, " + height + " cm wzrostu");
        System.out.println("Aktualnie jezdzisz samochodem marki " + carBrand + " " + carModel + " z " + carYear + " roku.");
        System.out.println("Czy chcesz zatwierdzić dane?");
        answer = scanner.nextBoolean();
    }
}