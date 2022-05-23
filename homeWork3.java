package HomeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        swapZeroAndOne();
        bigMassive();
        multiplication();
        fillingInTheDiagonals();
        reverseMassive(5,2);

    }
      private static void swapZeroAndOne() {
        Random random = new Random();
       int [] data = new int[5];
       for(int i = 0; i < data.length; i++){
           data[i] = random.nextInt(2);         //НЕ уверен, что правильно, но хотелось попробовать!
           if(data[i]==0) {                            //Хотелось бы узнать ваше мнение! Ниже верный вариант!
               data[i]=1;
           }
           else {
               data[i]=0;
           }
           System.out.println(data[i]);

       }
          /* int[] data = {0, 1, 1, 0, 1, 0, 1, 0};
          int i;
          for (i = 0; i < data.length; i++) {
              if (data[i] == 0) {
                  data[i] = 1;
              } else {
                  data[i] = 0;
              }
              System.out.println(data[i] + " ");
          } */
      }
    private static void bigMassive() {
        int a = 1;
        int [] data = new int[100];
        for(int i = 0; i< data.length; i++) {
            data[i]=a++;
        }
        System.out.println(Arrays.toString(data));
    }
    private static void fillingInTheDiagonals() {
        final int A = 5;
        int[][] data = new int[A][A];
        for(int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                if (i == j || A-i-1==j) {
                    data[i][j] = 1;
                }
                else {
                    data[i][j] = 0;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
     private static void multiplication() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < data.length; i++) {
            if(data[i]<6) {
                data[i]*=2;
            }
            System.out.println(data[i]);
        }
    }

    private static void reverseMassive(int len, int initialValue) {
        int[] data = new int[len];
        for (int i = 0; i < data.length; i++) {
            data[i]=initialValue;
            System.out.println("*" + data[i]);
        }

    }



}
