package zad.com;
import java.util.Arrays;
import java.util.Scanner;
public class Zadanie4 {
public  static  void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Wpisz 5 liczb po kolei");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();
    int e = input.nextInt();
    int[] array = {a,b,c,d,e,};
    Arrays.sort(array);
    System.out.printf("Posortowane : %s", Arrays.toString(array));
}

}
