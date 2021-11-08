package zad.com;
import java.util.Arrays;
class Insertionsort {
    public static void main(String args[]){
        int[] arr= new int[]{3,5,4,3,9,4,5,7};
        for (int i = 1; i<arr.length;i++){
            int temp=arr[i];
            int j = i-1;
            while (j>= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]=temp;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    }


