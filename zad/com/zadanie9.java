package zad.com;
import java.util.Scanner;
public class zadanie9 {
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[]{3, 7, 8, 6, 5, 4, 2, 5, 6};
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        }
                    }
                }
            for (int n : arr) {
                System.out.println(n);
            }
        }
}


