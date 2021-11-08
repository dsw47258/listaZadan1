package zad.com;
import java.util.Scanner;
public class Zadanie7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int liczbaPierwsza;
        int liczbaDruga;
        System.out.println("wprowadz liczbe pierwsza");
        liczbaPierwsza = input.nextInt();
       char znak = input.next().charAt(0);
        switch (znak) {
            case '+': {
                liczbaDruga = input.nextInt();
                System.out.println(liczbaPierwsza + liczbaDruga);
                break;
            } case '-': {
                liczbaDruga = input.nextInt();
                System.out.println(liczbaPierwsza - liczbaDruga);
                break;
            } case '*': {
                liczbaDruga = input.nextInt();
                System.out.println(liczbaPierwsza * liczbaDruga);
                break;
            } case '/': {
                liczbaDruga = input.nextInt();
                if (liczbaDruga != 0) {
                    System.out.println(liczbaPierwsza / liczbaDruga + "rezta: " + liczbaPierwsza % liczbaDruga);
                } else {
                    System.out.println("Nie dzieli się przez zero!");
                }break;
            }
            case '%':{
                liczbaDruga = input.nextInt();
                System.out.println("Nie ma takiego działania");
                break;
        }

        }

        }
    }

