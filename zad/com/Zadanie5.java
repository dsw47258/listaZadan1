package zad.com;
import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie5 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int r;
        System.out.println("Podaj liczbe");
        r = input.nextInt();
        double poleKola = (pow(r,2)*PI*4);
        System.out.println("Pole koła: "+poleKola);
        double objetoscKola = (pow(r,3)*PI*4/3);
        System.out.println("Objętość koła: "+ objetoscKola);

    }
}
