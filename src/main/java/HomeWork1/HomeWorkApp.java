package HomeWork1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a =ThreadLocalRandom.current().nextInt();
        int b = ThreadLocalRandom.current().nextInt();
        if(a>=b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }

    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt() ;
        if (value<=0) {
            System.out.println("Red!");
        }
        else if(value>0 && value<=100) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green!");
        }
    }

    private static void checkSumSign() {
        int a = ThreadLocalRandom.current().nextInt(8);
        int b = -3;
        int c =a+b;
        if(c>=0){
            System.out.println("The amount is positive!");
        }
        else {
            System.out.println("The amount is negative");
        }
    }


    private static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
