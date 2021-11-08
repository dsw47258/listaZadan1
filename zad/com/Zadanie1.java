package zad.com;

import java.util.Scanner;

public class Zadanie1 {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

          System.out.println("What's your name?");
          String name = input.nextLine();
          System.out.println("Hello " + name + "!");
      }
}

