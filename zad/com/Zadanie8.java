package zad.com;

import java.util.Scanner;

public class Zadanie8 {
public  static void main(String[] args){
    Scanner input = new Scanner(System.in);
Zadanie8 fibonacci = new Zadanie8();

System.out.println(fibonacci.fib(7));
}
    public int fib(int n) {
        if (n<=1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
}


    }

