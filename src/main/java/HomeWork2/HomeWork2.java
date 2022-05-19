package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        limits(2, 8);
        positiveOrNegative(2);
        stringsAndNumbers(5, "hello!");
        checkingTheYear(1900);

    }




    private static boolean limits(int firstNum , int secondNum) {
        if(firstNum+secondNum>=10 && firstNum+secondNum<=20) {
            return(true);
        }
        else {
        return false;}
    }

    private static int positiveOrNegative(int number) {
        if(number>=0) {
            System.out.println("Positive!");
        }
        else{
            System.out.println("Negative!");
        }
        return 0;
    }
    private static void stringsAndNumbers(int number, String String) {
        for(int i = 0; i<number;i++) {
            System.out.println(String);
        }

    }
    private static boolean checkingTheYear(int year) {
        if((year%400==0)|| ((year%4==0)&&(year%100!=0))){
            return(true);
        }
        else{
            return(false);
        }
    }
}
