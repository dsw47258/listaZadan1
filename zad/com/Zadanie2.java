package zad.com;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz imie i nazwisko");
        String name = input.nextLine();


        System.out.println("Podaj numer telefonu");
        String number = input.nextLine();

        System.out.println("Podaj miejsce urodzenia");
        String placeOfBirth = input.nextLine();

        System.out.println("Podaj datę urodzenia" );
        String dateOfBirth = input.nextLine();

        System.out.println("Wpisz wykształcenie");
        String education = input.nextLine();

        System.out.println("Podaj doświadczenie zawodowe");
        String expierence = input.nextLine();

        System.out.println("Podaj umiejętności");
        String skills = input.nextLine();

        System.out.println("Podaj zainteresowania");
        String interested = input.nextLine();
        System.out.println(name + "; Kontakt: " + number +

                "; Miasto :" + placeOfBirth +
                "; Data urodzenia:  " + dateOfBirth +
                "; Wykształcenie:  " + education +
                "; Doświadczenie zawodowe: " + expierence +
                "; Umiejętności: " + skills+
                "; Zainteresownia: " + interested + ".");
    }
    }
