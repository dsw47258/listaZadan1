package zad.com;
import java.util.Scanner;
public class Zadanie6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz cenę za towar");
        int cena = input.nextInt();
        System.out.println("Cena towaru: "+ cena + "zł");
        int liczbaRat;
        int rata;
        double rataMiesieczna=0;
        int oprocentowanie;
        double cenaMiesieczna ;
        double cenaCalkowita;
        if(cena>=1000 && cena<= 5000){
            liczbaRat = 3;
            rataMiesieczna = cena/liczbaRat;

        }
        else if(cena>5000 && cena<= 10000){
            liczbaRat = 6;
            rataMiesieczna = cena/liczbaRat;
        }
        else if (cena>1000){
            liczbaRat = 12;
            rataMiesieczna = cena/liczbaRat;
        }
        else {
            System.out.println("Zbyt niska cena!");
            liczbaRat=0;
        }
        System.out.println("Ilość rat: "+ liczbaRat);

        if(liczbaRat == 3){
          cenaMiesieczna = ((3*rataMiesieczna)/100) + rataMiesieczna;
             oprocentowanie = 3;
             cenaCalkowita = cenaMiesieczna*liczbaRat;

        }else if(liczbaRat == 6){
              cenaMiesieczna = ((6*rataMiesieczna)/100)+ rataMiesieczna;
             oprocentowanie = 6;
            cenaCalkowita = cenaMiesieczna*liczbaRat;

        }else if(liczbaRat== 12) {
             cenaMiesieczna = ((10*rataMiesieczna)/100)+ rataMiesieczna;
             oprocentowanie = 10;
            cenaCalkowita = cenaMiesieczna*liczbaRat;

        }
        else {
            oprocentowanie=0;
            cenaMiesieczna=0;
            cenaCalkowita = 0;
        }
        System.out.println("Oprocentowanie : " + oprocentowanie + "%");
        System.out.println("Cena za miesiąc : " + cenaMiesieczna + "zł");
        System.out.println("Cena łączna: " + cenaCalkowita + "zł");

    }
}
