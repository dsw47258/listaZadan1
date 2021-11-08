package zad.com;
import java.util.Scanner;
public class Zadanie3 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz pierwszą ");
        int a = input.nextInt();
        System.out.println("wpisz drugą liczbę");
        int b = input.nextInt();
        System.out.println("wpisz trzecią liczbę");
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println("pierwsza największa !");
        } else if (b >= a && b >= c) {
            System.out.println("Największą jest ta druga !");
        } else {
            System.out.println("Trzecia jest największą !");
        }
    }
}

