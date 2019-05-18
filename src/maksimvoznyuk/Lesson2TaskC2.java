package maksimvoznyuk;

import java.util.Scanner;

public class Lesson2TaskC2 {
    public static void main (String args []){
        System.out.println ("Введите число 1: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.println ("Введите число 2: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        int c = a + b;
        System.out.println ("DEC: " + a + "+" + b + "=" + c);
        System.out.println ("BIN: " + Integer.toBinaryString(a)+ "+" + Integer.toBinaryString(b) + "="+ Integer.toBinaryString(a + b));
        System.out.println ("HEX: " + Integer.toHexString(a) + "+" + Integer.toHexString(b) + "+" + "=" + Integer.toHexString(a+b));
        System.out.println ("OKT: " + Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "+" + "=" + Integer.toOctalString(a+b));

    }
}
