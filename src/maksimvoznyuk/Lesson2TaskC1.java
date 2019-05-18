package maksimvoznyuk;

import java.util.Scanner;

public class Lesson2TaskC1 {
    public static void main (String args []){
        System.out.println ("Введите число 1: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.println ("Введите число 2: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        int c = a + b;
        System.out.println ("Сумма равна" + c);
    }
}
